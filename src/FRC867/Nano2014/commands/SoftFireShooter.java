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
public class SoftFireShooter extends CommandGroup {
    
    public SoftFireShooter() {
           
        addSequential(new ShortExtendShooter());
        addSequential(new RetractShooter());    
    }
}
