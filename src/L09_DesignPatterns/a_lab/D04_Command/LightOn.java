package L09_DesignPatterns.a_lab.D04_Command;

public class LightOn implements Command{
    private Lamp lamp;

    public LightOn(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.on();
    }
}
