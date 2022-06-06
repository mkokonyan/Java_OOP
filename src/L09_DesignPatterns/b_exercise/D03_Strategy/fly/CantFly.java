package L09_DesignPatterns.b_exercise.D03_Strategy.fly;

public class CantFly implements FlyStrategy {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
