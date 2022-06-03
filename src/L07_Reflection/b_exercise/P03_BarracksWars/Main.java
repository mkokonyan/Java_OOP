package L07_Reflection.b_exercise.P03_BarracksWars;


import L07_Reflection.b_exercise.P03_BarracksWars.core.Engine;
import L07_Reflection.b_exercise.P03_BarracksWars.core.factories.UnitFactoryImpl;
import L07_Reflection.b_exercise.P03_BarracksWars.data.UnitRepository;
import L07_Reflection.b_exercise.P03_BarracksWars.interfaces.Repository;
import L07_Reflection.b_exercise.P03_BarracksWars.interfaces.UnitFactory;

public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();

        Runnable engine = new Engine(repository, unitFactory);
        engine.run();
    }
}
