package L07_Reflection.b_exercise.P03_BarracksWars.core.commands;

import L07_Reflection.b_exercise.P03_BarracksWars.interfaces.Executable;
import L07_Reflection.b_exercise.P03_BarracksWars.interfaces.Repository;
import L07_Reflection.b_exercise.P03_BarracksWars.interfaces.UnitFactory;

public abstract class Command implements Executable {
    private String[] data;
    private Repository repository;
    private UnitFactory unitFactory;

    public Command(String[] data, Repository repository, UnitFactory unitFactory) {
        this.data = data;
        this.repository = repository;
        this.unitFactory = unitFactory;
    }

    public String[] getData() {
        return data;
    }

    public Repository getRepository() {
        return repository;
    }

    public UnitFactory getUnitFactory() {
        return unitFactory;
    }
}
