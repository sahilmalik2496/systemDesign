package machineCoding.amazon;

class Payment {
    private String paymentId;
    private String userId;
    private double amount;
    private PaymentMethod paymentMethod;
    private PaymentStatus status;

    public Payment(String paymentId, String userId, double amount, PaymentMethod paymentMethod) {
        this.paymentId = paymentId;
        this.userId = userId;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.status = PaymentStatus.PENDING;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void processPayment() {
        this.status = PaymentStatus.COMPLETED;
    }
}

