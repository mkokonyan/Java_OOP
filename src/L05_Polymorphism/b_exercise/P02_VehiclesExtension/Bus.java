package L05_Polymorphism.b_exercise.P02_VehiclesExtension;

public class Bus extends Vehicle {
    public static final double ADDITIONAL_CONSUMPTION_WITH_PEOPLE = 1.4;
    public static final double ADDITIONAL_CONSUMPTION_EMPTY = 1.0;


    protected Bus(double fuelQuantity, double fuelConsumption, int tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    public void refueling(String vehicleType, double litters) {
        super.refueling(vehicleType, litters);
        super.setFuelQuantity(super.getFuelQuantity() + litters);
    }


}
