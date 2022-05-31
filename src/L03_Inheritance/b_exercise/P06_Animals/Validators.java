package L03_Inheritance.b_exercise.P06_Animals;

public class Validators {
    public static void validateData(String  value) {
        if (value.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid input!");
        }
    }

}
