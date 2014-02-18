/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FRC867.Nano2014.subsystems;

import FRC867.Nano2014.RobotMap;
import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Team-867
 */
public class BallDistanceSensor extends Subsystem {
    
    //public static Ultrasonic ultrasonic = new Ultrasonic(RobotMap.BallDistanceSensorInput,
    //        RobotMap.BallDistanceSensorOutput);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        
        //Set the distance sensing automatic to true
        //ultrasonic.setAutomaticMode(true);
    }
    
    public double GetAverageDistance(){
        double setMeasure[] = new double[150];
        for(int i=0; i<150; i++){
            setMeasure[i] = GetDistanceInches();
        }
        return median(setMeasure);
    }
    
    private double GetDistanceInches(){
        //return ultrasonic.getRangeInches();
        return 0.0;
    }
    
    private static double median(double[] m) {
        int middle = m.length/2;
        if (m.length%2 == 1) {
            return m[middle];
        } else {
            return (m[middle-1] + m[middle]) / 2.0;
        }
    }
}
