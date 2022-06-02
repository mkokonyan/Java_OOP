package L05_Polymorphism.b_exercise.P02_VehiclesExtension;

public class Car extends Vehicle {
    public static final double ADDITIONAL_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double fuelConsumption, int tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    public void refueling(String vehicleType, double litters) {
        super.refueling(vehicleType, litters);
        super.setFuelQuantity(super.getFuelQuantity() + litters);
    }
}
