package L05_Polymorphism.b_exercise.P02_VehiclesExtension;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] carTokens = scanner.nextLine().split("\\s+");
        String[] truckTokens = scanner.nextLine().split("\\s+");
        String[] busTokens = scanner.nextLine().split("\\s+");

        Car car = new Car(Double.parseDouble(carTokens[1]), Double.parseDouble(carTokens[2]), Integer.parseInt(carTokens[3]));
        Truck truck = new Truck(Double.parseDouble(truckTokens[1]), Double.parseDouble(truckTokens[2]), Integer.parseInt(truckTokens[3]));
        Bus bus = new Bus(Double.parseDouble(busTokens[1]), Double.parseDouble(busTokens[2]), Integer.parseInt(busTokens[3]));

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfCommands; i++) {
            String[] data = scanner.nextLine().split("\\s+");

            String command = data[0];
            String vehicleType = data[1];
            double value = Double.parseDouble(data[2]);

            try {
                switch (command) {
                    case "Drive":
                        switch (vehicleType) {
                            case "Car":
                                car.driving(vehicleType, Car.ADDITIONAL_CONSUMPTION,  value);
                                break;
                            case "Truck":
                                truck.driving(vehicleType, Truck.ADDITIONAL_CONSUMPTION, value);
                                break;
                            case "Bus":
                                bus.driving(vehicleType, Bus.ADDITIONAL_CONSUMPTION_WITH_PEOPLE,  value);
                                break;
                        }
                        break;
                    case "DriveEmpty":
                        bus.driving(vehicleType, Bus.ADDITIONAL_CONSUMPTION_EMPTY, value);
                        break;
                    case "Refuel":
                        switch (vehicleType) {
                            case "Car":
                                car.refueling(vehicleType, value);
                                break;
                            case "Truck":
                                truck.refueling(vehicleType, value);
                                break;
                            case "Bus":
                                bus.refueling(vehicleType, value);
                                break;
                        }
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.printf("Car: %.2f%n", car.getFuelQuantity());
        System.out.printf("Truck: %.2f%n", truck.getFuelQuantity());
        System.out.printf("Bus: %.2f%n", bus.getFuelQuantity());
    }
}
