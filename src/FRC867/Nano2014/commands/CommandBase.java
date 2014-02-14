package FRC867.Nano2014.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import FRC867.Nano2014.OI;
import FRC867.Nano2014.subsystems.CompressorSubsystem;
import FRC867.Nano2014.subsystems.DriveTrain;
import FRC867.Nano2014.subsystems.Intake;
import FRC867.Nano2014.subsystems.Shooter;

/**
 * The base for all commands. All atomic commands should subclass CommandBase.
 * CommandBase stores creates and stores each control system. To access a
 * subsystem elsewhere in your code in your code use CommandBase.exampleSubsystem
 * @author Author
 */
public abstract class CommandBase extends Command {

    public static OI oi;
    
    public static DriveTrain driveTrain = new DriveTrain();    
    public static CompressorSubsystem compressor = new CompressorSubsystem();
    public static Shooter shooter = new Shooter();
    public static Intake intake = new Intake();

    public static void init() {
        oi = new OI();
        
        //Start up the compressor
        Command startCompressor = new StartCompressor();
        startCompressor.start();
        
        //Make sure the solenoids are closed
        Command stopShooter = new StopShooter();
        stopShooter.start();

        // Show what command your subsystem is running on the SmartDashboard
        SmartDashboard.putData(driveTrain);
        SmartDashboard.putData(compressor);
    }

    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }
}
