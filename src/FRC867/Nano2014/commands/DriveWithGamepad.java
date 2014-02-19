/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FRC867.Nano2014.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 * @author Mike
 */
public class DriveWithGamepad extends CommandBase {
    
    public DriveWithGamepad() {
        requires(driveTrain);
        //requires(ballDistanceSensor);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        driveTrain.DriveArcade(oi.getSpeed(), oi.getTurn());
        
        //Output the drive direction to users
        if(driveTrain.GetDirection()==1){
            SmartDashboard.putString("Drive Direction", "Shooter is Front");
        }else{
            SmartDashboard.putString("Drive Direction", "Intake is Front");
        }
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false; //This is a default command so we'll be returning false here
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
