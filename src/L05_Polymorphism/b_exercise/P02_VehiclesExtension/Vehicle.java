package L05_Polymorphism.b_exercise.P02_VehiclesExtension;

import java.text.DecimalFormat;

public abstract class Vehicle {
    private double fuelQuantity;
    private double fuelConsumption;
    private int tankCapacity;

    protected Vehicle(double fuelQuantity, double fuelConsumption, int tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
        setTankCapacity(tankCapacity);
    }

    public void driving(String vehicleType, double additionalConsumption, double km) {
        DecimalFormat df = new DecimalFormat("#.##");

        if (this.fuelQuantity / (this.fuelConsumption + additionalConsumption) < km) {
            throw new IllegalArgumentException(String.format("%s needs refueling", vehicleType));
        } else {
            this.setFuelQuantity(this.fuelQuantity - (this.fuelConsumption + additionalConsumption) * km);
            System.out.printf("%s travelled %s km%n", vehicleType, df.format(km));
        }
    }

    public void refueling(String vehicleType, double litters) {
        if (litters <= 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        }

    }

    public double getFuelQuantity() {
        return this.fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        if (fuelQuantity > this.tankCapacity) {
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        if (this.fuelQuantity <= 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        }

        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelConsumption() {
        return this.fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getTankCapacity() {
        return this.tankCapacity;
    }

    public void setTankCapacity(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }
}
