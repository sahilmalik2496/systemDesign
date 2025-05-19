package LLD.designPatterns.strategyPatternn;

public class UpiPayment implements PaymentStrategy {
    private String upiId;

    public UpiPayment(String upiId) {
        this.upiId = upiId;
    }

    public void pay(int amount) {
        System.out.println("Paid ₹" + amount + " using UPI: " + upiId);
    }
}

