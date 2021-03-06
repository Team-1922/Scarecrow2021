// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrainSubsystem;
import frc.robot.subsystems.TOF;

public class RoombaMode extends CommandBase {
  DriveTrainSubsystem m_driveTrain;
  TOF m_TOF;

  /** Creates a new RoombaMode. */
  public RoombaMode(DriveTrainSubsystem driveTrain, TOF TOF) {
    m_driveTrain = driveTrain;
    m_TOF = TOF;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(m_driveTrain, m_TOF);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

    
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
