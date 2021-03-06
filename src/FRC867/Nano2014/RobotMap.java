package FRC867.Nano2014;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    //Drive Train Setup
    public static final int DriveTrainLeftMotor = 1;
    public static final int DriveTrainRightMotor = 2;
    
    public static final int PressureSwitchChannel = 1; //GPIO
    public static final int CompressorRelayChannel = 1; //Relay Channel
    
    public static final int ShooterRight = 1;
    public static final int ShooterLeft = 2;
    
    //public static final int ShooterSolenoidLeftFoward = 1;
    //public static final int ShooterSolenoidLeftReverse = 2;
    
    // static final int ShooterSolenoidRightFoward = 3;
    //public static final int ShooterSolenoidRightReverse = 4;
   
    public static final int IntakeMotor = 3; //Top CIM on Intake
    
    public static final int LaserRelay = 4; //Laser Pointer Spike Relay
    
    //public static final int BallDistanceSensorOutput = 11;
    //public static final int BallDistanceSensorInput = 12;
    
}
