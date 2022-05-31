package L02_Encapsulation.b_exercise.P04_PizzaCalories;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;

    public Pizza (String name, int numberOfToppings) {
        setName(name);
        setToppings(numberOfToppings);

        this.toppings = new ArrayList<>();
    }

    private void setName(String name) {
        Validators.pizzaNameValidator(name);

        this.name = name;
    }

    private void setToppings(int toppings) {
       Validators.pizzaToppingsNumberValidator(toppings);
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public String getName() {
        return this.name;
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public double getOverallCalories() {
        return this.dough.calculateCalories() + Arrays.stream(toppings.stream().map(Topping::calculateCalories).mapToDouble(Double::valueOf).toArray()).sum();
    }
}
