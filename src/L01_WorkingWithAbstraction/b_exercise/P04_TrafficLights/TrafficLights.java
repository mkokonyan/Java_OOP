package L01_WorkingWithAbstraction.b_exercise.P04_TrafficLights;

public enum TrafficLights {
    RED,
    GREEN,
    YELLOW;

    private static TrafficLights[] vals = values();

    public TrafficLights next() {
        return vals[(this.ordinal() + 1) % vals.length];
    }

}
