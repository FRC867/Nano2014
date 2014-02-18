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
public class IntakeWithTrigger extends CommandBase {
    
    public IntakeWithTrigger() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(intake);
        //requires(ballDistanceSensor);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        double leftTrigger = oi.getLeftTrigger();
        
        //Stop the intake motor once the ball is detected to be in the launcher
        //If there is no ball AND intake is running in OR outtake is running
        //if(ballDistanceSensor.GetAverageDistance() > 10 && leftTrigger > 0 || leftTrigger < 0){ 
            intake.runIntake(leftTrigger);
        //}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
