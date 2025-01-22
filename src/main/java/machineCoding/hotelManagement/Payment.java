package machineCoding.hotelManagement;

import java.util.UUID;

class Payment {
    private String paymentId;
    private double amount;
    private PaymentMode paymentMode;
    private boolean success;

    public Payment(double amount, PaymentMode paymentMode) {
        this.paymentId = UUID.randomUUID().toString();
        this.amount = amount;
        this.paymentMode = paymentMode;
        this.success = processPayment();
    }

    private boolean processPayment() {
        // Simulating a payment gateway response
        return true;  // Assuming the payment is always successful
    }

    public boolean isSuccess() {
        return success;
    }
}
