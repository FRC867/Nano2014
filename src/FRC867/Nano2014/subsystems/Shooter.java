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
    
    public double ShooterPower = 1.0;
    
    private Solenoid shooterLeftSolenoid = new Solenoid(RobotMap.ShooterLeft);
    private Solenoid shooterRightSolenoid = new Solenoid(RobotMap.ShooterRight);
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void Shoot(){
        shooterLeftSolenoid.set(true);
        shooterRightSolenoid.set(true);
    }
    
    public void Reset(){
        shooterLeftSolenoid.set(false);
        shooterRightSolenoid.set(false);
    }
    
    public void Reverse(){
        shooterLeftSolenoid.set(false);
        shooterRightSolenoid.set(false);
    }
    
    public void SetShooterPower(double power){
        ShooterPower = power;
    }
    
    public double GetShooterPower(){
        return ShooterPower;
    }
}
