package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Shooter;

public class stopIntake extends Command{
    public Intake intake;

    public stopIntake(Intake intake){
        this.intake=intake;
    }

    @Override
    public void execute(){
        intake.stopIntake();
    }

}
