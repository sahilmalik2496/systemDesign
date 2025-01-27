package machineCoding.vendingMachine;

class PaymentProcessor {
    private int currentBalance;

    public PaymentProcessor() {
        this.currentBalance = 0;
    }

    public void acceptPayment(int amount) {
        currentBalance += amount;
    }

    public boolean isPaymentSufficient(int price) {
        return currentBalance >= price;
    }

    public int refundBalance(int price) {
        int change = currentBalance - price;
        currentBalance = 0;
        return change;
    }
}
