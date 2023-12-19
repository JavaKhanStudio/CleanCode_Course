package exo3.livraison;

public enum CountryMultiplier {
    USA(1.2),
    FRANCE(1.5),
    GERMANY(1.4),
    JAPAN(1.3),
    CANADA(1.1);

    private final double multiplier;

    CountryMultiplier(double multiplier) {
        this.multiplier = multiplier;
    }

    public double getMultiplier() {
        return multiplier;
    }
}

