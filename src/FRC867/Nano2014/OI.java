
package FRC867.Nano2014;

import FRC867.Nano2014.commands.DriveForwardDirection;
import FRC867.Nano2014.commands.DriveReverseDirection;
import FRC867.Nano2014.commands.ExtendShooter;
import FRC867.Nano2014.commands.FireShooter;
import FRC867.Nano2014.commands.RetractShooter;
import FRC867.Nano2014.commands.ReverseDrive;
import FRC867.Nano2014.commands.SoftFireShooter;
import FRC867.Nano2014.commands.StartCompressor;
import FRC867.Nano2014.commands.ToggleCompressor;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.DigitalIOButton;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    Joystick gamePad = new Joystick(1);
    Button buttonA = new JoystickButton(gamePad, 1),
            buttonB = new JoystickButton(gamePad, 2),
            buttonX = new JoystickButton(gamePad, 3),
            buttonY = new JoystickButton(gamePad, 4),         
            buttonLB = new JoystickButton(gamePad, 5),         
            buttonRB = new JoystickButton(gamePad, 6),
            buttonBack = new JoystickButton(gamePad, 7),
            buttonRightJoystick = new JoystickButton(gamePad, 10);
    
    //Joystick joyStick = new Joystick(1);
    
    public OI(){
        //TODO: Bind onPress for buttons
        buttonX.whenPressed(new DriveForwardDirection());
        buttonY.whenPressed(new DriveReverseDirection());
        buttonA.whenPressed(new ReverseDrive());
        buttonRB.whenPressed(new FireShooter());
        buttonLB.whenPressed(new SoftFireShooter());
        buttonBack.whenPressed(new ToggleCompressor()); //Allow for compressor overrides
        
        //buttonRightJoystick.whenPressed(new ReverseDrive()); //Disable this feature since it's annoying
    }
    
    public double getSpeed(){
        return gamePad.getRawAxis(5); //Right Thumb Y Axis
    }
    
    public double getTurn(){
        return gamePad.getRawAxis(4); //Right Thumb X Axis
    }
    
    public double getLeftTrigger(){
        return -1*gamePad.getRawAxis(3); //Left Trigger Axis (-1 is to read the left as intake)
    }   
    
    //public double getShotPower(){
        //return (joyStick.getRawAxis(3)+1)/2;
    //    return 1.0;
    //}
    
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
}

