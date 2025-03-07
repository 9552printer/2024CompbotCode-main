// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    // bucket Constants

    // Motor Constants
    public static final class drive{
        public static final int LEFT_MOTOR = 3;
        public static final int REAR_LEFT_MOTOR = 4;
        public static final int RIGHT_MOTOR = 5;
        public static final int REAR_RIGHT_MOTOR = 2;
        public static final double DRIVE_SPEED_MULTIPLYER = .6;
        public static final double wheelRadius=0.0762;
        public static final double gearRatio=6.145;
        public static final double conversionFactor = wheelRadius*Math.PI*2/(gearRatio);
    
    }

    public static final class auto{
        public static final double AUTONOMOUS_FORWARD_SPEED = 0.6;
        public static final double AUTONOMOUS_BACK_SPEED = 0.4;
        public static final String straightPID = null;
        public static final double kd = 1;
        public static final double ki = 0.05;
        public static final double kp = 0.4;
        public static final double tolerence=0.1;
    }
    

    public static final class intake{
        public static final int intakeMotorPort=9;
        public static final int beamBreakPort = Shooter.beamBreakPort;
        public static final double intakeSpeed = 1;
        public static final double outtakeSpeed  = 0.5;

    }

    
    

    public static final int MOVEMENT_JOYSTICK = 0;
    public static final int MANIPULATOR_JOYSTICK = 1;
    public static final class Shooter{

        public static final double intakeSpeed = -0.2;

        public static final int ShooterMotorLeft=6;
        public static final int ShooterMotorRight=7;
        public static final int beamBreakPort = 1;


        public static final double shootSpeaker=1;
        public static final double shootAmp=0.2;
        public static final double indexSpeed=0;
        public static final int minimumSpeed = 60;
        public static int indexMotor;
    }

    public static final class Climber{

        public static final double MotorUp = 0.2;
        public static final double MotorDown = 0.2;

        public static final int ClimberMotor=8;
    }




}
