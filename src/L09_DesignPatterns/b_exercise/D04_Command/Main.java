package L09_DesignPatterns.b_exercise.D04_Command;

public class Main {
    public static void main(String[] args) {

        Radio radio = new Radio();
        Controller controller = new Controller();

        controller.executeCommand(new VolumeDownCommand(radio));
    }
}
