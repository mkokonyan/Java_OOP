package L04_InterfacesAndAbstraction.a_lab.P06_Ferrari;

public class Ferrari implements Car {
    private String driverName;
    private String model;

    public Ferrari(String driver) {
        this.driverName = driver;
        this.model = "488-Spider";
    }

    @Override
    public String brakes() {
        return "Brakes!";
    }

    @Override
    public String gas() {
        return "brum-brum-brum-brrrrr";
    }

    @Override
    public String toString() {
        return String.format("%s/%s/%s/%s", model, brakes(), gas(), driverName);
    }
}
