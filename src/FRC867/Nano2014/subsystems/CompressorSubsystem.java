/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FRC867.Nano2014.subsystems;

import FRC867.Nano2014.RobotMap;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Mike
 */
public class CompressorSubsystem extends Subsystem {
    
    private final Compressor compressor = new Compressor(RobotMap.PressureSwitchChannel, RobotMap.CompressorRelayChannel); //GPIO/Relay

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void Start(){
        compressor.start();
    }
    
    public void Stop(){
        compressor.stop();
    }
}
