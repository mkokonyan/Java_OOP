package L09_DesignPatterns.b_exercise.D04_Command;

public class Controller {
    Command command;



    public void executeCommand(Command command) {
        this.command = command;
        command.execute();
    }
}
