package L04_InterfacesAndAbstraction.b_exercise.P03_BirthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Birthable> birthables = new ArrayList<>();

        String commandLine = scanner.nextLine();

        while (!commandLine.equals("End")) {
            String type = commandLine.split("\\s+")[0];
            String name = commandLine.split("\\s+")[1];
            String birthdate;
            switch (type) {
                case "Citizen":
                    int age = Integer.parseInt(commandLine.split("\\s+")[2]);
                    String id = commandLine.split("\\s+")[3];
                    birthdate = commandLine.split("\\s+")[4];

                    Citizen citizen = new Citizen(name, age, id, birthdate);
                    birthables.add(citizen);
                    break;

                case "Pet":
                    birthdate = commandLine.split("\\s+")[2];

                    Pet pet = new Pet(name, birthdate);
                    birthables.add(pet);
                    break;
            }
            commandLine = scanner.nextLine();
        }
        String filteredYear = scanner.nextLine();

        birthables.stream()
                .map(Birthable::getBirthDate)
                .filter(b -> b.endsWith(filteredYear))
                .forEach(System.out::println);
    }
}
