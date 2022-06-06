package L09_DesignPatterns.b_exercise.D01_Factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pizzaType = scanner.nextLine();

        PizzaFactory pizzaFactory = new PizzaFactory();
        Pizza pizza = pizzaFactory.createPizza(pizzaType);

        pizza.prepare();
        pizza.bake();
        pizza.box();
    }
}
