package L02_Encapsulation.b_exercise.P04_PizzaCalories;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Validators {
    public static void doughTypeValidator(String flourType) {
        if (!flourType.equals("White") && !flourType.equals("Wholegrain")) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    public static void doughWeightValidator(double weight) {
        if (weight < 1 || weight > 200) {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
    }

    public static void toppingTypeValidator(String toppingType) {
        if (!Arrays.stream(ToppingsModifiers.values())
                .map(String::valueOf)
                .collect(Collectors.toList())
                .contains(toppingType)) {
            throw new IllegalArgumentException(String.format("Cannot place %s on top of your pizza.", toppingType));
        }
    }

    public static void toppingWeightValidator(String toppingType, double weight) {
        if (weight < 1 || weight > 50) {
            throw new IllegalArgumentException(String.format("%s weight should be in the range [1..50].", toppingType));
        }
    }

    public static void pizzaNameValidator(String name) {
        if (name.length() < 1 || name.trim().length() == 0 || name.length() > 15) {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
    }

    public static void pizzaToppingsNumberValidator(int numberOfToppings) {
        if (numberOfToppings < 0 || numberOfToppings > 10) {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
    }
}
