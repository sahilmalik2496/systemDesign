package machineCoding.parkingLot;

// Exit Gate to trigger Payment
public class ExitGate {
    private PaymentStrategy paymentStrategy;

    public ExitGate(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double amount) {
        paymentStrategy.pay(amount);
    }
}
