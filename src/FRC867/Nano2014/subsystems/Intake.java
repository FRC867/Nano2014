/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FRC867.Nano2014.subsystems;

import FRC867.Nano2014.RobotMap;
import FRC867.Nano2014.commands.IntakeWithTrigger;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Team-867
 */
public class Intake extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    Victor intakeMotor = new Victor(RobotMap.IntakeMotor);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new IntakeWithTrigger());
    }
    
    public void runIntake(double speed){
        intakeMotor.set(speed);
    }
    
    public void stopIntake(){
        intakeMotor.set(0);
    }
}
