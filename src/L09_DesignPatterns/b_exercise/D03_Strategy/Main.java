package L09_DesignPatterns.b_exercise.D03_Strategy;

import L09_DesignPatterns.b_exercise.D03_Strategy.fly.CantFly;
import L09_DesignPatterns.b_exercise.D03_Strategy.fly.FlyHigh;
import L09_DesignPatterns.b_exercise.D03_Strategy.fly.FlyNearBeach;

public class Main {
    public static void main(String[] args) {
        Bird eagle = new Bird(new CantFly());
        eagle.fly();

        eagle.setStrategy(new FlyNearBeach());
        eagle.fly();

        eagle.setStrategy(new FlyHigh());
        eagle.fly();
    }
}
