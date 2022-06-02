package L05_Polymorphism.b_exercise.P02_VehiclesExtension;


public class Truck extends Vehicle {
    public static final double ADDITIONAL_CONSUMPTION = 1.6;


    protected Truck(double fuelQuantity, double fuelConsumption, int tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    public void refueling(String vehicleType, double litters) {
        super.refueling(vehicleType, litters);
        super.setFuelQuantity(super.getFuelQuantity() + 0.95 * litters);
    }
}
