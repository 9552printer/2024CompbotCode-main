package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Intake;

public class OuttakeCom extends Command{
    public Intake intake;

    public OuttakeCom(Intake intake){

        this.intake = intake;

        addRequirements(intake);
    }

    @Override
    public void execute(){
        intake.Outtake();
    }


    @Override
    public void end(boolean wasInterupted){
        intake.stopIntake();
    }


}
