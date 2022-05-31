package L02_Encapsulation.b_exercise.P04_PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] pizzaTokens = scanner.nextLine().split("\\s+");
        String[] doughTokens = scanner.nextLine().split("\\s+");

        Pizza pizza = null;

        try {
            String pizzaName = pizzaTokens[1];
            int numberOfToppings = Integer.parseInt(pizzaTokens[2]);

            String flourType = doughTokens[1];
            String bakingTechnique = doughTokens[2];
            double doughWeight = Double.parseDouble(doughTokens[3]);

            pizza = new Pizza(pizzaName, numberOfToppings);
            Dough dough = new Dough(flourType, bakingTechnique, doughWeight);
            pizza.setDough(dough);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }

        String toppingTokens = scanner.nextLine();
        while (!toppingTokens.equals("END")) {
            String toppingType = toppingTokens.split("\\s+")[1];
            double toppingWeight = Double.parseDouble(toppingTokens.split("\\s+")[2]);

            try {
                Topping topping = new Topping(toppingType, toppingWeight);
                pizza.addTopping(topping);

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.exit(1);
            }

            toppingTokens = scanner.nextLine();
        }

        System.out.printf("%s - %.2f", pizza.getName(), pizza.getOverallCalories());


    }
}