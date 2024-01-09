package dp.decorator.structure;

public class BasicCoffee implements Coffee {
    @Override
    public double getCost() {
        return 2.00; // basic cost
    }

    @Override
    public String getDescription() {
        return "Basic Coffee";
    }
}