package L02_Encapsulation.b_exercise.P04_PizzaCalories;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        Validators.toppingTypeValidator(toppingType);

        this.toppingType = toppingType;
    }

    private void setWeight(double weight) {
        Validators.toppingWeightValidator(this.toppingType, weight);

        this.weight = weight;
    }

    public double calculateCalories() {
       return (2 * this.weight) * ToppingsModifiers.valueOf(toppingType).getModifier();
    }
}
