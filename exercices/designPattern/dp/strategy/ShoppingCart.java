package dp.strategy;

public class ShoppingCart {
    private PaymentStrategy paymentMethod;

    public void setPaymentMethod(PaymentStrategy paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void checkout(int amount) {
        paymentMethod.pay(amount);
    }
}