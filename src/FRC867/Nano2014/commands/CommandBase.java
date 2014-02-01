package FRC867.Nano2014.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import FRC867.Nano2014.OI;
import FRC867.Nano2014.subsystems.CompressorSubsystem;
import FRC867.Nano2014.subsystems.DriveTrain;

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

    public static void init() {
        oi = new OI();
        
        //Start up the compressor
        Command startCompressor = new StartCompressor();
        startCompressor.start();

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
