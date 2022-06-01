package L05_Polymorphism.a_lab.P02_Shapes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Shape shape = new Circle(4.0);
        Shape shape2 = new Rectangle(13.0, 27.0);

        printShape(shape);
        printShape(shape2);
    }

    private static void printShape(Shape shape) {
        System.out.println(shape.calculateArea());
        System.out.println(shape.calculatePerimeter());
    }
}
