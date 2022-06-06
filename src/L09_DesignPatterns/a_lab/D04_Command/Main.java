package L09_DesignPatterns.a_lab.D04_Command;

public class Main {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();

        Switch invoker = new Switch();

        invoker.storeAndExecute(new LightOn(lamp));
        invoker.storeAndExecute(new LightOff(lamp));

    }

}
