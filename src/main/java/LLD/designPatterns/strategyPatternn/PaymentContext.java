package LLD.designPatterns.strategyPatternn;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void payAmount(int amount) {
        if (paymentStrategy == null) {
            throw new IllegalStateException("Payment Strategy not set");
        }
        paymentStrategy.pay(amount);
    }
}
