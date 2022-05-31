package L03_Inheritance.b_exercise.P04_NeedForSpeed;

public class Main {
    public static void main(String[] args) {

        RaceMotorcycle motorcycle = new RaceMotorcycle(100, 200);
        System.out.println(motorcycle.getFuel());
        motorcycle.drive(10);
        System.out.println(motorcycle.getFuel());


    }
}
