package L01_WorkingWithAbstraction.b_exercise.P01_CardSuit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        CardSuits[] cardSuits = CardSuits.values();

        System.out.println("Card Suits:");
        for (CardSuits cardSuit : cardSuits) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", cardSuit.ordinal(), cardSuit);
        }



    }
}
