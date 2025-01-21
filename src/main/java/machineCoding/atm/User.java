package machineCoding.atm;

class User {
    private String userId;
    private String name;
    private String phoneNumber;
    private Account account;
    private String pin;

    public User(String userId, String name, String phoneNumber, String pin, Account account) {
        this.userId = userId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.pin = pin;
        this.account = account;
    }

    // Getters and Setters
    public String getUserId() {
        return userId;
    }

    public Account getAccount() {
        return account;
    }

    public boolean authenticate(String enteredPin) {
        return this.pin.equals(enteredPin);
    }
}
