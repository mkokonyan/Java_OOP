package L07_Reflection.b_exercise.P03_BarracksWars.core.commands;

import L07_Reflection.b_exercise.P03_BarracksWars.interfaces.Repository;
import L07_Reflection.b_exercise.P03_BarracksWars.interfaces.UnitFactory;

public class Fight extends Command{

    public Fight(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        return "fight";
    }
}
