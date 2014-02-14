/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FRC867.Nano2014.subsystems;

import FRC867.Nano2014.RobotMap;
import FRC867.Nano2014.commands.DriveWithGamepad;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Mike
 */
public class DriveTrain extends Subsystem {    
    RobotDrive chassis = new RobotDrive(RobotMap.DriveTrainLeftMotor, RobotMap.DriveTrainRightMotor);
    
    public void initDefaultCommand() {
        setDefaultCommand(new DriveWithGamepad());
    }
        
    public void DriveArcade(double speed, double steering){
        chassis.arcadeDrive(speed, -1*steering, true); //Unvert the steering
    }
    
    //TODO: Not Tested
    public void DriveTank(double leftPower, double rightPower){
        chassis.tankDrive(leftPower, rightPower, true);
    }
}
