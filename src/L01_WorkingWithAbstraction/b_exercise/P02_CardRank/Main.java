package L01_WorkingWithAbstraction.b_exercise.P02_CardRank;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CardRank[] cardRanks = CardRank.values();
        String input = scanner.nextLine();

        System.out.println("Card Ranks:");
        Arrays.stream(cardRanks).forEach(cr -> System.out.printf("Ordinal value: %d; Name value: %s%n", cr.ordinal(), cr));

    }
}
