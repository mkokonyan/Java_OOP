package L07_Reflection.b_exercise.P03_BarracksWars.core.commands;

import L07_Reflection.b_exercise.P03_BarracksWars.interfaces.Repository;
import L07_Reflection.b_exercise.P03_BarracksWars.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

public class Retire extends Command{


    public Retire(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() throws ExecutionControl.NotImplementedException {
        String unitType = getData()[1];
        getRepository().removeUnit(unitType);

        return unitType + " retired!";
    }
}
