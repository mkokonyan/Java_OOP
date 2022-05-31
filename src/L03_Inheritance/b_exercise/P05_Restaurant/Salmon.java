package L03_Inheritance.b_exercise.P05_Restaurant;

import java.math.BigDecimal;

public class Salmon extends MainDish {
    private static final double SALMON_GRAMS = 22;

    public Salmon(String name, BigDecimal price, double grams) {
        super(name, price, SALMON_GRAMS);
    }
}
