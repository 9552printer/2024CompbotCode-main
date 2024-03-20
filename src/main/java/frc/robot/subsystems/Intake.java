package frc.robot.subsystems;

import com.revrobotics.CANSparkLowLevel.MotorType;
import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;

public class Intake extends SubsystemBase{
    private final CANSparkMax intakeMotor1 = new CANSparkMax(Constants.intake.intakeMotorPort, MotorType.kBrushed);

   
    //private final MotorControllerGroup intakeMotors = new MotorControllerGroup(intakeMotor1);

  //  private DigitalInput beamBreak = new DigitalInput(Constants.Shooter.beamBreakPort);
    
    

   /* public Intake(DigitalInput //beamBreak){
        //this.beamBreak = beamBreak;
        intakeMotor1.setInverted(true);
    }

    public boolean getBeamBreak(){
      //  return beamBreak.get();
    }

    public void runIntake(){
         
        intakeMotor1.set(Constants.intake.intakeSpeed);
    }

    public void index(){
        intakeMotor1.set(Constants.intake.indexSpeed);
    }



    
} */ 

/*public Command runIntake(double intakeSpeed){
    return Commands.startEnd(
        () -> {
            intakeMotor1.set(intakeSpeed);
        }, () -> {
            intakeMotor1.set(0);
        }, this);
}*/

  public void runIntake() {
     
    intakeMotor1.setInverted(true);  
    Commands.startEnd(
        () -> {
            intakeMotor1.set(1);
        }, () -> {
            intakeMotor1.set(0);
        }, this); 
   // intakeMotor1.set(Constants.intake.intakeSpeed);
    }
    
public void Outtake() {
        intakeMotor1.setInverted(false);
        intakeMotor1.set(Constants.intake.outtakeSpeed);
    }

    public void stopIntake(){
        intakeMotor1.set(0);
    }

}