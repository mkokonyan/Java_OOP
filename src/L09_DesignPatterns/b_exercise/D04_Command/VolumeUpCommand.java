package L09_DesignPatterns.b_exercise.D04_Command;

public class VolumeUpCommand implements Command {
    Radio radio;

    public VolumeUpCommand(Radio radio) {
        this.radio = radio;
    }

    @Override
    public void execute() {
        this.radio.volumeUp();
    }
}
