package exo2.potato;

public class FriesShop {
	private static int potatoes = 0;
	private static int fries = 0;

	public static void main(String[] args) {
		int customersToServe = 5;

		harvestPotatoes(5);
		for (int i = 0; i < customersToServe; i++) {
			ramassePatate();
			processOrder();
		}
	}

	private static void processOrder() {

		if (potatoes < 5) {
			System.out.println("Not enough potatoes to make fries for an order.");
			return;
		}
		potatoes -= 5;
		fries += 5;

		if (fries < 3) {
			System.out.println("Not enough fries to sell. Making more fries...");
			processOrder(); // TODO NOT A RECURSIVE CALL
		} else {
			// Sell fries
			fries -= 3;
			// Show Selling fries
			System.out.println("Served an order of fries.");
			// Empty spot
		}
	}

	private static void ramassePatate() {
		harvestPotatoes(10);
	}

	private static void harvestPotatoes(int quantity) {
		potatoes += quantity;
	}
}
