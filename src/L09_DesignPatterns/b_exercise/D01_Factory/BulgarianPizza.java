package L09_DesignPatterns.b_exercise.D01_Factory;

public class BulgarianPizza extends Pizza{


    public BulgarianPizza(double diameter) {
        super(diameter);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Bulgarian pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Bulgarian pizza");

    }

    @Override
    public void box() {
        System.out.println("Boxing Bulgarian pizza");

    }
}
