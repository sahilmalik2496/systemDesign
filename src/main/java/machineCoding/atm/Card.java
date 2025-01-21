package machineCoding.atm;

class Card {
    private String cardNumber;
    private String pin;

    public Card(String cardNumber, String pin) {
        this.cardNumber = cardNumber;
        this.pin = pin;
    }

    // Getters
    public String getCardNumber() {
        return cardNumber;
    }

    public String getPin() {
        return pin;
    }
}
