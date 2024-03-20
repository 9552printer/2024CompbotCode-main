package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Shooter;

public class revAmp extends Command{
    public Shooter shooter;

    public revAmp(Shooter shooter){
        this.shooter=shooter;
    }

    @Override
    public void execute(){
        shooter.runFlyForAmp();
    }


}