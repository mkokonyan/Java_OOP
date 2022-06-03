package L07_Reflection.b_exercise.P03_BarracksWars.core.factories;


import L07_Reflection.b_exercise.P03_BarracksWars.interfaces.Unit;
import L07_Reflection.b_exercise.P03_BarracksWars.interfaces.UnitFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UnitFactoryImpl implements UnitFactory {

    private static final String UNITS_PACKAGE_NAME =
            "L07_Reflection.b_exercise.P03_BarracksWars.models.units.";

    @Override
    public Unit createUnit(String unitType) {

        try {
            Class unitClass = Class.forName(UNITS_PACKAGE_NAME + unitType);
            Constructor<Unit> unitConstructor = unitClass.getDeclaredConstructor();

            return unitConstructor.newInstance();

        } catch (ClassNotFoundException
                 | NoSuchMethodException
                 | InstantiationException
                 | IllegalAccessException
                 | InvocationTargetException e) {
            throw new RuntimeException(e);
        }

    }
}
