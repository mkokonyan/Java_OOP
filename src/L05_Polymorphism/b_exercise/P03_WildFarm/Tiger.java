package L05_Polymorphism.b_exercise.P03_WildFarm;

public class Tiger extends Felime {
    private String livingRegion;

    public Tiger(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(Food food) {
        if (!(food instanceof Meat)) {
            System.out.printf("%ss are not eating that type of food!%n", this.animalType);
        } else {
            this.foodEaten += food.getQuantity();
        }

    }
}
