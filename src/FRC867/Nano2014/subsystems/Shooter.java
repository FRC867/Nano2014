/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FRC867.Nano2014.subsystems;

import FRC867.Nano2014.RobotMap;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Mike
 */
public class Shooter extends Subsystem {
    
    //TODO: Change these to single solenoids
    DoubleSolenoid shooterLeftSolenoid = new DoubleSolenoid(RobotMap.ShooterSolenoidLeftFoward, RobotMap.ShooterSolenoidLeftReverse);
    DoubleSolenoid shooterRightSolenoid = new DoubleSolenoid(RobotMap.ShooterSolenoidRightFoward, RobotMap.ShooterSolenoidRightReverse);
    //Solenoid testSolenoid = new Solenoid(1);
    //Solenoid testSolenoid1 = new Solenoid(2);
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void Shoot(){
        shooterLeftSolenoid.set(DoubleSolenoid.Value.kForward);
        shooterRightSolenoid.set(DoubleSolenoid.Value.kForward);
        //testSolenoid.set(true);
        //testSolenoid1.set(true);
    }
    
    public void Reset(){
        shooterLeftSolenoid.set(DoubleSolenoid.Value.kOff);
        shooterRightSolenoid.set(DoubleSolenoid.Value.kOff);
        //testSolenoid.set(false);
        //testSolenoid1.set(false);
    }
    
    public void Reverse(){
        shooterLeftSolenoid.set(DoubleSolenoid.Value.kReverse);
        shooterRightSolenoid.set(DoubleSolenoid.Value.kReverse);
    }
}
