package L01_WorkingWithAbstraction.a_lab.P04_HotelReservation;

public class PriceCalculator {
    double pricePerDay;
    int numberOfDays;
    Season season;
    DiscountType discountType;

    public PriceCalculator(double pricePerDay, int numberOfDays, Season season, DiscountType discountType) {
        this.pricePerDay = pricePerDay;
        this.numberOfDays = numberOfDays;
        this.season = season;
        this.discountType = discountType;
    }

    public double getTotalPrice() {
        return pricePerDay * numberOfDays * season.getSeasonMultiplicator() * discountType.getDiscountMultiplicator();
    }

}
