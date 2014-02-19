/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FRC867.Nano2014.subsystems;

import FRC867.Nano2014.RobotMap;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Mike
 */
public class CompressorSubsystem extends Subsystem {
    
    private final Compressor compressor = new Compressor(RobotMap.PressureSwitchChannel,1, RobotMap.CompressorRelayChannel,1); //GPIO/Relay\

    public void initDefaultCommand() {
    }
    
    public void Start(){
        compressor.start();
    }
    
    public void Stop(){
        compressor.stop();
    }
    
    public boolean Started(){
        return compressor.enabled();
    }
}
