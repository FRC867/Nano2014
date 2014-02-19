/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FRC867.Nano2014.subsystems;

import FRC867.Nano2014.RobotMap;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Team-867
 */
public class LaserPointer extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    Relay laserPointer = new Relay(RobotMap.LaserRelay);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void On(){
        laserPointer.set(Relay.Value.kForward);
    }
    
    public void Off(){
        laserPointer.set(Relay.Value.kOff);
    }
}
