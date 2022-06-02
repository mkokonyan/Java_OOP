package L05_Polymorphism.b_exercise.P03_WildFarm;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {
    protected String livingRegion;

    protected Mammal(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight);
        this.livingRegion = livingRegion;
    }

    @Override
    public void eat(Food food) {
        if (!(food instanceof Vegetable)) {
            System.out.printf("%ss are not eating that type of food!%n", this.animalType);
        } else {
            this.foodEaten += food.getQuantity();
        }

    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");

        return String.format("%s[%s, %s, %s, %d]",
                this.animalType,
                this.animalName,
                df.format(this.animalWeight),
                this.livingRegion,
                this.foodEaten);
    }
}
