package L01_WorkingWithAbstraction.a_lab.P04_HotelReservation;

public enum Season {
    Autumn(1),
    Spring(2),
    Winter(3),
    Summer(4);

    private final int seasonMultiplicator;

    Season(int seasonMultiplicator) {
        this.seasonMultiplicator = seasonMultiplicator;
    }

    public int getSeasonMultiplicator() {
        return seasonMultiplicator;
    }
}
