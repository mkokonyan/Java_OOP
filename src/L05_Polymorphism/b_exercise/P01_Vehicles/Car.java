package L05_Polymorphism.b_exercise.P01_Vehicles;

import java.text.DecimalFormat;

public class Car extends Vehicle {
    private static final double ADDITIONAL_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + Car.ADDITIONAL_CONSUMPTION);
    }

    @Override
    public void driving(double km) {
        DecimalFormat df = new DecimalFormat("#.##");

        if (fuelQuantity / fuelConsumption < km) {
            System.out.println("Car needs refueling");
        } else {
            super.setFuelQuantity(super.getFuelQuantity() - super.fuelConsumption * km);
            System.out.printf("Car travelled %s km%n", df.format(km));
        }
    }

    @Override
    public void refueling(double litters) {
        super.setFuelQuantity(super.getFuelQuantity() + litters);
    }
}
