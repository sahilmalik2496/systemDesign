package machineCoding.atm;

import java.util.HashMap;
import java.util.Map;

class ATM {
    private Map<String, User> users;
    private Map<String, Transaction> transactions;

    public ATM() {
        users = new HashMap<>();
        transactions = new HashMap<>();
    }

    // Add user to ATM system
    public void addUser(User user) {
        users.put(user.getUserId(), user);
    }

    // Validate card and PIN
    public boolean authenticateCard(Card card, String enteredPin) {
        User user = users.get(card.getCardNumber());
        return user != null && user.authenticate(enteredPin);
    }

    // Deposit money to an account
    public boolean deposit(String accountId, double amount) {
        User user = getUserByAccountId(accountId);
        if (user != null) {
            user.getAccount().deposit(amount);
            recordTransaction(accountId, "Deposit", amount);
            return true;
        }
        return false;
    }

    // Withdraw money from an account
    public boolean withdraw(String accountId, double amount) {
        User user = getUserByAccountId(accountId);
        if (user != null) {
            boolean isSuccess = user.getAccount().withdraw(amount);
            if (isSuccess) {
                recordTransaction(accountId, "Withdrawal", amount);
            }
            return isSuccess;
        }
        return false;
    }

    // Check account balance
    public double checkBalance(String accountId) {
        User user = getUserByAccountId(accountId);
        if (user != null) {
            return user.getAccount().getBalance();
        }
        return 0;
    }

    private User getUserByAccountId(String accountId) {
        for (User user : users.values()) {
            if (user.getAccount().getAccountId().equals(accountId)) {
                return user;
            }
        }
        return null;
    }

    private void recordTransaction(String accountId, String type, double amount) {
        String transactionId = "TX" + System.currentTimeMillis();
        Transaction transaction = new Transaction(transactionId, type, amount);
        transactions.put(transactionId, transaction);
    }
}