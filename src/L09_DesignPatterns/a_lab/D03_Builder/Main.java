package L09_DesignPatterns.a_lab.D03_Builder;

public class Main {
    public static void main(String[] args) {
        LunchOrder order = LunchOrder.Builder
                .get()
                .withMeat("Chicken")
                .withDrink("Water")
                .withBread("White")
                .build();

        System.out.println(order);
    }
}
