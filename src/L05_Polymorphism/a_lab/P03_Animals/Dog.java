package L05_Polymorphism.a_lab.P03_Animals;

public class Dog extends Animal{

    public Dog(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    public String explainSelf() {
        return super.explainSelf() + System.lineSeparator() + "DJAAF";
    }
}