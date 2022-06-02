package L05_Polymorphism.b_exercise.P03_WildFarm;

public abstract class Animal {
    protected String animalName;
    protected String animalType;
    protected Double animalWeight;
    protected Integer foodEaten;

    protected Animal(String animalName, String animalType, Double animalWeight) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
        this.foodEaten = 0;
    }

    protected abstract void makeSound();
    protected abstract void eat(Food food);

}
