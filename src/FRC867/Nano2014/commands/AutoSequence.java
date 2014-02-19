/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FRC867.Nano2014.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 * @author Team-867
 */
public class AutoSequence extends CommandGroup {
    
    public AutoSequence() {
        
        addSequential(new DriveForwardByTime(3.0)); //Drive Foward for 3 Seconds
        //addSequential(new FireShooter()); //Fire the shooter
        //addSequential(new DriveForwardByTime(3.0)); //Drive moar foward
        
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.
        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
