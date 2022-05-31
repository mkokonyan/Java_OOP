package L02_Encapsulation.b_exercise.P03_ShoppingSpree;

public class Validators {
    public static void nameValidator(String name) {
        if (name.length() < 1 || name.trim().length() == 0) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
    }

    public static void moneyValidator(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
    }
}
