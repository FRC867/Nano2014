/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FRC867.Nano2014.commands;

/**
 *
 * @author Team-867
 */
public class DriveForwardByTime extends CommandBase {
    
    private double driveForwardTime; //store the forward time for the setTimeout
    
    public DriveForwardByTime(double seconds) {        
        driveForwardTime = seconds; //Set the seconds that we're going to go forward for.
        
        requires(driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        driveTrain.DriveArcade(1, 0);
        this.setTimeout(driveForwardTime);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return this.isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
        driveTrain.DriveArcade(0, 0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
