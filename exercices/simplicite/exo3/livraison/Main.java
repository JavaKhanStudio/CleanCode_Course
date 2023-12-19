package exo3.livraison;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Item> items = List.of(Item.LAPTOP, Item.PHONE);
        calculateDeliveryPrice(items, CountryMultiplier.USA, 0.2, DiscountCode.DISCOUNT20, true);
    }

    private static void calculateDeliveryPrice(List<Item> items, CountryMultiplier country, double taxRate, DiscountCode discountCode, boolean isMember) {
        double totalWeight = 0.0;
        double totalCost = 0.0;
        double deliveryCost;

        for (Item item : items) {
            totalWeight += item.getWeight();
            totalCost += item.getPrice();
        }

        deliveryCost = totalWeight * country.getMultiplier();
        double tax = totalCost * taxRate;
        double total = totalCost + deliveryCost + tax;

        switch (discountCode) {
            case DISCOUNT20:
                total -= total * discountCode.getDiscountRate();
                break;
            case DISCOUNT10:
                total -= total * discountCode.getDiscountRate();
                break;
            case DISCOUNT15:
                total -= total * discountCode.getDiscountRate();
                break;
            case SPECIAL30:
                total -= total * discountCode.getDiscountRate();
                break;
            default:
                // No discount applied
        }

        if (isMember) {
            total -= total * 0.1;
        }

        System.out.println("Total delivery cost: " + total);
    }
}
