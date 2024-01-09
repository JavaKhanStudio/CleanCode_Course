package dp.strategy;

public class PayPalStrategy implements PaymentStrategy {
    private String emailId;

    public PayPalStrategy(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using PayPal.");
    }
}