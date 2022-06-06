package L09_DesignPatterns.a_lab.D04_Command;

import java.util.ArrayDeque;

public class Switch {

    private ArrayDeque<Command> history;

    public Switch() {
        this.history = new ArrayDeque<>();
    }

    public void storeAndExecute(Command command) {
        command.execute();
    }

    public void undoExecuted() {
        this.history.pop();
        Command command = this.history.peek();
        if (command != null) {
            command.execute();
        }
    }
}
