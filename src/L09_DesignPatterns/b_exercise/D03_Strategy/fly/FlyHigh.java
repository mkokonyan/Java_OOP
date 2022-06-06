package L09_DesignPatterns.b_exercise.D03_Strategy.fly;

public class FlyHigh implements FlyStrategy {

    @Override
    public void fly() {
        System.out.println("Fly high");
    }
}
