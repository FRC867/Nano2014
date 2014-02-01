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
    //private final Relay compressorSpike = new Relay(RobotMap.CompressorRelayChannel);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        //new Compressor(1,1,1,1);
    }
    
    public void Start(){
        compressor.start();
        //compressor.setRelayValue(Relay.Value.kForward);
        //compressorSpike.set(Relay.Value.kForward);
    }
    
    public void Stop(){
        compressor.stop();
        //compressorSpike.set(Relay.Value.kOff);
    }
}
