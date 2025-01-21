package machineCoding.atm;

class Transaction {
    private String transactionId;
    private String type; // Deposit, Withdrawal
    private double amount;
    private String status;

    public Transaction(String transactionId, String type, double amount) {
        this.transactionId = transactionId;
        this.type = type;
        this.amount = amount;
        this.status = "Pending";
    }

    // Getters and Setters
    public String getTransactionId() {
        return transactionId;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
