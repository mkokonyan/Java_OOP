package L01_WorkingWithAbstraction.a_lab;

import java.util.Scanner;

public class P01_RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printRhombus(n);

    }


    private static void printRhombus(int n) {
        printTop(n);
        printMiddle(n);
        printBottom(n);
    }

    public static void printLinesOfStars(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("* ");
        }
    }

    public static void printLineOfSpaces(int count) {
        for (int j = 0; j < count; j++) {
            System.out.print(" ");
        }
    }

    public static void printTop(int n) {
        for (int r = 1; r < n; r++) {
            printLineOfSpaces(n - r);
            printLinesOfStars(r);
            System.out.println();
        }
    }

    public static void printBottom(int n) {
        for (int r = 1; r < n; r++) {
            printLineOfSpaces(r);
            printLinesOfStars(n - r);
            System.out.println();
        }
    }

    public static void printMiddle(int n) {
        printLinesOfStars(n);
        System.out.println();
    }

}