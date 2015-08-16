/* 
 * Copyright (c) 2015 RobotsByTheC. All rights reserved.
 *
 * Open Source Software - may be modified and shared by FRC teams. The code must
 * be accompanied by the BSD license file in the root directory of the project.
 */
package org.usfirst.frc2084.DemoRobot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc2084.DemoRobot.Robot;
import org.usfirst.frc2084.DemoRobot.subsystems.ClawSubsystem;

/**
 * {@link Command} that lowers the claw.
 */
public class LowerClaw extends Command {

    public LowerClaw() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.clawSubsystem);
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    /**
     * Lowers the claw. We have no feedback on the servo, so the command just
     * finishes.
     */
    protected void initialize() {
        Robot.clawSubsystem.setLiftState(ClawSubsystem.LiftState.LOWERED);
    }

    protected void execute() {
    }

    /**
     * The command finishes immediately.
     * 
     * @return true
     */
    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
