package machineCoding.bookMyShow;

class Payment {
    private String paymentId;
    private double amount;
    private boolean isPaid;

    public Payment(String paymentId, double amount) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.isPaid = false;
    }

    // Method to process the payment
    public boolean processPayment() {
        this.isPaid = true;
        return true; // Assuming payment is always successful for simplicity
    }

    public double getAmount() {
        return amount;
    }

    public boolean isPaid() {
        return isPaid;
    }
}
