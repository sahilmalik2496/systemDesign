package machineCoding.atm;

class Account {
    private String accountId;
    private double balance;
    private String accountType; // e.g., savings, checking

    public Account(String accountId, double initialBalance, String accountType) {
        this.accountId = accountId;
        this.balance = initialBalance;
        this.accountType = accountType;
    }

    // Getters and Setters
    public String getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

    public void printStatement() {
        System.out.println("Account ID: " + accountId + " | Balance: " + balance);
    }
}
