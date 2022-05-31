package L02_Encapsulation.b_exercise.P03_ShoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] personTokens = scanner.nextLine().split(";");
        String[] productTokens = scanner.nextLine().split(";");

        List<Person> peopleList = new ArrayList<>();
        List<Product> productsList = new ArrayList<>();

        try {
            for (String person : personTokens) {
                String name = person.split("=")[0];
                double money = Double.parseDouble(person.split("=")[1]);

                peopleList.add(new Person(name, money));
            }
            for (String product : productTokens) {
                String name = product.split("=")[0];
                double cost = Double.parseDouble(product.split("=")[1]);

                productsList.add(new Product(name, cost));
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }

        String actions = scanner.nextLine();
        while (!actions.equals("END")) {
            String personName = actions.split("\\s+")[0];
            String productName = actions.split("\\s+")[1];

            Person searchedPerson = peopleList.stream()
                    .filter(p -> p.getName().equals(personName))
                    .collect(Collectors.toList())
                    .get(0);

            Product searchedProduct = productsList.stream()
                    .filter(p -> p.getName().equals(productName))
                    .collect(Collectors.toList())
                    .get(0);

            try {
                searchedPerson.buyProduct(searchedProduct);
                System.out.println(String.format("%s bought %s", searchedPerson.getName(), searchedProduct.getName()));

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            actions = scanner.nextLine();
        }
        peopleList.forEach(p -> {
            if (p.getProducts().isEmpty()) {
                System.out.println(String.format("%s - Nothing bought", p.getName()));

            } else {
                System.out.println(String.format("%s - %s",
                        p.getName(), p.getProducts()
                                .stream()
                                .map(Product::getName)
                                .collect(Collectors.joining(", "))));
            }
        });

    }
}
