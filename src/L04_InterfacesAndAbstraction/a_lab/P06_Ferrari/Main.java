package L04_InterfacesAndAbstraction.a_lab.P06_Ferrari;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String driver = scanner.nextLine();

        Car ferrari = new Ferrari(driver);

        System.out.println(ferrari.toString());
    }
}
