package L07_Reflection.b_exercise.P03_BarracksWars.core;


import L07_Reflection.b_exercise.P03_BarracksWars.core.commands.Command;
import L07_Reflection.b_exercise.P03_BarracksWars.interfaces.Executable;
import L07_Reflection.b_exercise.P03_BarracksWars.interfaces.Repository;
import L07_Reflection.b_exercise.P03_BarracksWars.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Engine implements Runnable {
    private static String COMMANDS_PATH_NAME = "L07_Reflection.b_exercise.P03_BarracksWars.core.commands.";
    private static String EXECUTE_METHOD_NAME = "execute";

    private Repository repository;
    private UnitFactory unitFactory;

    public Engine(Repository repository, UnitFactory unitFactory) {
        this.repository = repository;
        this.unitFactory = unitFactory;
    }

    @Override
    public void run() {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        while (true) {
            try {

                String input = reader.readLine();
                String[] data = input.split("\\s+");
                String commandName = data[0];
                String result = interpretCommand(data, commandName);
                if (result.equals("fight")) {
                    break;
                }
                System.out.println(result);
            } catch (RuntimeException | IOException | ExecutionControl.NotImplementedException |
                     ClassNotFoundException | NoSuchMethodException | InvocationTargetException |
                     InstantiationException | IllegalAccessException e) {
                System.out.println(e.getMessage());
            }
        }
    }


    private String interpretCommand(String[] data, String commandName) throws ExecutionControl.NotImplementedException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        String commandClassName = commandName.substring(0, 1).toUpperCase() + commandName.substring(1);

        String result = "";
        Class<?> clazz = Class.forName(COMMANDS_PATH_NAME + commandClassName);
        Constructor<Command> constructor = (Constructor<Command>) clazz.getDeclaredConstructor(String[].class, Repository.class, UnitFactory.class);

        Command commandInstance = constructor.newInstance(data, this.repository, this.unitFactory);
        Method executeMethod = clazz.getDeclaredMethod(EXECUTE_METHOD_NAME);

        try {
            result = (String) executeMethod.invoke(commandInstance);

        } catch (InvocationTargetException e) {
            System.out.print(e.getCause().getMessage());
        }

        return result;
    }
}


