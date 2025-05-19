package LLD.designPatterns.strategyPatternn;

public class StrategyPattern {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
        context.payAmount(500);

        context.setPaymentStrategy(new UpiPayment("user@upi"));
        context.payAmount(300);
    }
}
