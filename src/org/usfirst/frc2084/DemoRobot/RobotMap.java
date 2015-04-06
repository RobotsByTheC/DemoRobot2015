/* 
 * Copyright (c) 2015 RobotsByTheC. All rights reserved.
 *
 * Open Source Software - may be modified and shared by FRC teams. The code must
 * be accompanied by the BSD license file in the root directory of the project.
 */
package org.usfirst.frc2084.DemoRobot;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static SpeedController driveSubsystemLeftJaguar;
    public static SpeedController driveSubsystemRightJaguar;
    public static RobotDrive driveSubsystemController;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveSubsystemLeftJaguar = new Jaguar(1, 1);
        LiveWindow.addActuator("Drive Subsystem", "Left Jaguar", (Jaguar) driveSubsystemLeftJaguar);

        driveSubsystemRightJaguar = new Jaguar(1, 2);
        LiveWindow.addActuator("Drive Subsystem", "Right Jaguar", (Jaguar) driveSubsystemRightJaguar);

        driveSubsystemController = new RobotDrive(driveSubsystemLeftJaguar, driveSubsystemRightJaguar);

        driveSubsystemController.setSafetyEnabled(true);
        driveSubsystemController.setExpiration(0.1);
        driveSubsystemController.setSensitivity(0.5);
        driveSubsystemController.setMaxOutput(1.0);
        driveSubsystemController.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
        driveSubsystemController.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
