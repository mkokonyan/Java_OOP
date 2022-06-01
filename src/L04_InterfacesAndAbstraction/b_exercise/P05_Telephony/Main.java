package L04_InterfacesAndAbstraction.b_exercise.P05_Telephony;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> numbers = List.of(scanner.nextLine().split("\\s+"));
        List<String> urls = List.of(scanner.nextLine().split("\\s+"));

        Smartphone smartphone = new Smartphone(numbers, urls);
        System.out.println(smartphone.call() + smartphone.browse());

    }
}
