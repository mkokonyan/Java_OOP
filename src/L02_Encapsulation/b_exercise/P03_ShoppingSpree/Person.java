package L02_Encapsulation.b_exercise.P03_ShoppingSpree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        this.products = new ArrayList<>();
    }

    private void setName(String name) {
        Validators.nameValidator(name);

        this.name = name;
    }

    private void setMoney(double money) {
        Validators.moneyValidator(money);

        this.money = money;
    }

    public void buyProduct (Product product) {
        if (this.money < product.getCost()) {
            throw new IllegalArgumentException(String.format("%s can't afford %s", this.name, product.getName()));
        }

        this.products.add(product);
        this.money -= product.getCost();
    }

    public String getName() {
        return this.name;
    }

    public List<Product> getProducts() {
        return Collections.unmodifiableList(products);
    }
}
