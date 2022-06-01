package L04_InterfacesAndAbstraction.b_exercise.P04_FoodShortage;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        Map<String, Buyer> buyersMap = new LinkedHashMap<>();

        for (int i = 0; i < numberOfPeople; i++) {
            String[] peopleTokens = scanner.nextLine().split("\\s+");

            String name = peopleTokens[0];
            int age = Integer.parseInt(peopleTokens[1]);


            if (peopleTokens.length == 4) {

                String id = peopleTokens[2];
                String birthdate = peopleTokens[3];

                Citizen citizen = new Citizen(name, age, id, birthdate);
                buyersMap.putIfAbsent(name, citizen);

            } else {
                String group = peopleTokens[2];

                Rebel rebel = new Rebel(name, age, group);
                buyersMap.putIfAbsent(name, rebel);
            }
        }

        String buyerName = scanner.nextLine();
        while (!buyerName.equals("End")) {
            if (buyersMap.containsKey(buyerName)) {
                buyersMap.get(buyerName).buyFood();
            }
            buyerName = scanner.nextLine();
        }

        System.out.println(Arrays.stream(buyersMap
                        .values()
                        .stream()
                        .map(Buyer::getFood)
                        .mapToInt(e -> e)
                        .toArray())
                        .sum());

    }
}
