package L02_Encapsulation.b_exercise.P03_ShoppingSpree;

public class Product {
    private String name;
    private double cost;

    public Product(String name, double cost) {
        setName(name);
        setCost(cost);
    }

    private void setCost(double cost) {
        Validators.moneyValidator(cost);

        this.cost = cost;
    }

    private void setName(String name) {
        Validators.nameValidator(name);

        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public double getCost() {
        return this.cost;
    }
}
