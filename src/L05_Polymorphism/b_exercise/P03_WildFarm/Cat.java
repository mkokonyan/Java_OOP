package L05_Polymorphism.b_exercise.P03_WildFarm;

import java.text.DecimalFormat;

public class Cat extends Felime {
    private String breed;

    public Cat(String animalName, String animalType, Double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eat(Food food) {
        this.foodEaten += food.getQuantity();
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");

        return String.format("%s[%s, %s, %s, %s, %d]",
                this.animalType,
                this.animalName,
                this.breed,
                df.format(animalWeight),
                this.livingRegion,
                this.foodEaten);
    }

}

