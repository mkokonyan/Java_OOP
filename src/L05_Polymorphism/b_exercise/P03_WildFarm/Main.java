package L05_Polymorphism.b_exercise.P03_WildFarm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        List<Animal> animalList = new ArrayList<>();


        while(!command.equals("End")) {

            String[] animalInfo = command.split("\\s+");
            String animalType = animalInfo[0];
            String animalName = animalInfo[1];
            Double animalWeight = Double.parseDouble(animalInfo[2]);
            String animalLivingRegion = animalInfo[3];

            Animal animal = null;
            Food food = null;


            switch (animalType) {
                case "Mouse":
                    animal = new Mouse(animalName, animalType, animalWeight, animalLivingRegion);
                    break;
                case "Zebra":
                    animal = new Zebra(animalName, animalType, animalWeight, animalLivingRegion);
                    break;
                case "Tiger":
                    animal = new Tiger(animalName, animalType, animalWeight, animalLivingRegion);
                    break;
                case "Cat":
                    String breed = animalInfo[4];
                    animal = new Cat(animalName, animalType, animalWeight, animalLivingRegion, breed);
                    break;
            }
            String[] foodInfo = scanner.nextLine().split("\\s+");

            String foodType = foodInfo[0];
            Integer foodQuantity = Integer.parseInt(foodInfo[1]);

            switch (foodType) {
                case "Vegetable":
                    food = new Vegetable(foodQuantity);
                    break;
                case "Meat":
                    food = new Meat(foodQuantity);
                    break;
            }

            animal.makeSound();
            animal.eat(food);
            animalList.add(animal);

            command = scanner.nextLine();
        }

        animalList.forEach(System.out::println);
    }
}
