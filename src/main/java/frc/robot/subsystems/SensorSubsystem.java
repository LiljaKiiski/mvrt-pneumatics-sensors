// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.ColorSensorV3;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class SensorSubsystem extends SubsystemBase {

  private final I2C.Port i2cPort = I2C.Port.kOnboard;
  private ColorSensorV3 colorSensor;
  private DigitalInput proximitySensor;

  /** Creates a new SensorSubsystem. */
  public SensorSubsystem() {
    // initialize color sensor
    colorSensor = new ColorSensorV3(i2cPort);
    // initialize proximity sensor
    proximitySensor = new DigitalInput(0);
  }

  public String getColor(){
    return "RGB: " + colorSensor.getColor();
  }

  public String getProximity(){
    if (proximitySensor.get()){
      return "Close enough";
    }
    return "Too far";
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
