/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FRC867.Nano2014.subsystems;

import FRC867.Nano2014.RobotMap;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Mike
 */
public class Shooter extends Subsystem {
    
    //TODO: Change these to single solenoids
    DoubleSolenoid shooterLeftSolenoid = new DoubleSolenoid(RobotMap.ShooterSolenoidLeftFoward, RobotMap.ShooterSolenoidLeftReverse);
    DoubleSolenoid shooterRightSolenoid = new DoubleSolenoid(RobotMap.ShooterSolenoidRightFoward, RobotMap.ShooterSolenoidRightReverse);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void Shoot(){
        shooterLeftSolenoid.set(DoubleSolenoid.Value.kForward);
        shooterRightSolenoid.set(DoubleSolenoid.Value.kForward);
    }
}
