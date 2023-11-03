// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.SensorSubsystem;

public class LogSensorValues extends CommandBase {

  private SensorSubsystem sensorSubsystem;

  /** Creates a new LogSensorValues. */
  public LogSensorValues(SensorSubsystem sensorSubsystem) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.sensorSubsystem = sensorSubsystem;
    addRequirements(sensorSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    // log values to smartdashboard:
    // color sensor

    // proximity sensor
    
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
