package L09_DesignPatterns.b_exercise.D01_Factory;

public class PizzaFactory {
    public Pizza createPizza(String pizzaType) {

        Pizza pizza = switch (pizzaType) {
            case "Bulgarian" -> new BulgarianPizza(45);
            case "Italian" -> new ItalianPizza(20);
            default -> null;
        };

        return pizza;
    }
}
