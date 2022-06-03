package L07_Reflection.b_exercise.P03_BarracksWars.interfaces;

import jdk.jshell.spi.ExecutionControl;

public interface Executable {

	String execute() throws ExecutionControl.NotImplementedException;

}
