package frc.robot;

import edu.wpi.first.wpilibj.Joystick;

public class OI {

    Joystick joyLeft = new Joystick(Constants.JOYSTICK_PORT_LEFT);
    Joystick joyRight = new Joystick(Constants.JOYSTICK_PORT_RIGHT);

    public double getJoystickLeftY() {
        return (Math.abs(joyLeft.getY()) < Constants.JOYSTICK_LEFT_DEADZONE_Y ? 0: joyLeft.getY());
    }

    public double getJoystickRightY() {
        return(Math.abs(joyRight.getY()) < Constants.JOYSTICK_RIGHT_DEADZONE_Y ? 0: joyRight.getY());
    }

}

