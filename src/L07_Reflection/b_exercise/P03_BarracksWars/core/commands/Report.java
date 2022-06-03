package L07_Reflection.b_exercise.P03_BarracksWars.core.commands;

import L07_Reflection.b_exercise.P03_BarracksWars.interfaces.Repository;
import L07_Reflection.b_exercise.P03_BarracksWars.interfaces.UnitFactory;

public class Report extends Command{


    public Report(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        String output = getRepository().getStatistics();
        return output;
    }
}
