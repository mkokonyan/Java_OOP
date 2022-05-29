package L01_WorkingWithAbstraction.b_exercise.P04_TrafficLights;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());


        String[] trafficLights =  Arrays.stream(input).map(s -> TrafficLights.valueOf(s).next().name()).toArray(String[]::new);
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.stream(trafficLights).collect(Collectors.joining(" ")));
            trafficLights = Arrays.stream(trafficLights).map(s -> TrafficLights.valueOf(s).next().name()).toArray(String[]::new);
        }
    }
}
