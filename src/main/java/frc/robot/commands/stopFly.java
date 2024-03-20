package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Shooter;

public class stopFly extends Command{
    public Shooter shooter;

    public stopFly(Shooter shooter){
        this.shooter=shooter;
    }

    @Override
    public void execute(){
        shooter.stopShoot();
    }


}
