package exo3.livraison;

public enum Item {
    LAPTOP("Laptop", 2.5, 1200.00),
    PHONE("Phone", 0.5, 800.00),
    HEADPHONES("Headphones", 0.3, 150.00),
    CAMERA("Camera", 1.0, 500.00),
    WATCH("Watch", 0.2, 250.00);

    private final String name;
    private final double weight;
    private final double price;

    Item(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }
}
