package L09_DesignPatterns.b_exercise.D04_Command;

public class VolumeDownCommand implements Command {
    Radio radio;

    public VolumeDownCommand(Radio radio) {
        this.radio = radio;
    }

    @Override
    public void execute() {
        this.radio.volumeDown();
    }
}
