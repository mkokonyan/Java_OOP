package L09_DesignPatterns.b_exercise.D03_Strategy;

import L09_DesignPatterns.b_exercise.D03_Strategy.fly.FlyStrategy;

public class Bird {
    FlyStrategy strategy;

    public Bird(FlyStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(FlyStrategy strategy) {
        this.strategy = strategy;
    }

    public void fly() {
        this.strategy.fly();
    }
}
