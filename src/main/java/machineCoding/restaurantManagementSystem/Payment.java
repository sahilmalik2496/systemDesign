package machineCoding.restaurantManagementSystem;

import java.util.UUID;

class Payment {
    private String paymentId;
    private double amount;
    private PaymentMode mode;
    private boolean isSuccessful;

    public Payment(double amount, PaymentMode mode) {
        this.paymentId = UUID.randomUUID().toString();
        this.amount = amount;
        this.mode = mode;
        this.isSuccessful = processPayment();
    }

    private boolean processPayment() {
        // Simulate payment success
        return true;
    }

    public boolean isSuccessful() {
        return isSuccessful;
    }
}
