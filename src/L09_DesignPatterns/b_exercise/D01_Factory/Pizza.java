package L09_DesignPatterns.b_exercise.D01_Factory;

public abstract class Pizza {
    private double diameter;

    public Pizza(double diameter) {
        this.diameter = diameter;
    }

    abstract public void prepare();
    abstract public void bake();
    abstract public void box();

}
