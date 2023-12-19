package exo3.livraison;

public enum DiscountCode {
    DISCOUNT20(0.20),
    DISCOUNT10(0.10),
    DISCOUNT15(0.15),
    SPECIAL30(0.30);

    private final double discountRate;

    DiscountCode(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }
}
