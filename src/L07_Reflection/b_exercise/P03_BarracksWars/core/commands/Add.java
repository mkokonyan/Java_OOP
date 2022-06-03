package L07_Reflection.b_exercise.P03_BarracksWars.core.commands;

import L07_Reflection.b_exercise.P03_BarracksWars.interfaces.Repository;
import L07_Reflection.b_exercise.P03_BarracksWars.interfaces.Unit;
import L07_Reflection.b_exercise.P03_BarracksWars.interfaces.UnitFactory;


public class Add extends Command {


    public Add(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        String unitType = getData()[1];
        Unit unitToAdd = getUnitFactory().createUnit(unitType);
        getRepository().addUnit(unitToAdd);
        String output = unitType + " added!";
        return output;
    }


}

