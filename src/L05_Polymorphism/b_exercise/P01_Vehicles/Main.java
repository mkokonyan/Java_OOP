package L05_Polymorphism.b_exercise.P01_Vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] carTokens = scanner.nextLine().split("\\s+");
        String[] truckTokens = scanner.nextLine().split("\\s+");

        Car car = new Car(Double.parseDouble(carTokens[1]), Double.parseDouble(carTokens[2]));
        Truck truck = new Truck(Double.parseDouble(truckTokens[1]), Double.parseDouble(truckTokens[2]));

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfCommands; i++) {
            String[] data = scanner.nextLine().split("\\s+");

            String command = data[0];
            String vehicleType = data[1];
            double value = Double.parseDouble(data[2]);

            switch (command) {
                case "Drive":
                    switch (vehicleType) {
                        case "Car":
                            car.driving(value);
                            break;
                        case "Truck":
                            truck.driving(value);
                            break;
                    }
                    break;
                case "Refuel":
                    switch (vehicleType) {
                        case "Car":
                            car.refueling(value);
                            break;
                        case "Truck":
                            truck.refueling(value);
                            break;
                    }
                    break;
            }
        }
        System.out.printf("Car: %.2f%n", car.getFuelQuantity());
        System.out.printf("Truck: %.2f%n", truck.getFuelQuantity());
    }
}
