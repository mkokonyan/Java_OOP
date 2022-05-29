package L01_WorkingWithAbstraction.a_lab.P04_HotelReservation;

public enum DiscountType {
    VIP(0.8),
    SecondVisit(0.9),
    None(1.00);

    private final double discountMultiplicator;

    DiscountType(double discountMultiplicator) {
        this.discountMultiplicator = discountMultiplicator;
    }

    public double getDiscountMultiplicator() {
        return discountMultiplicator;
    }
}

