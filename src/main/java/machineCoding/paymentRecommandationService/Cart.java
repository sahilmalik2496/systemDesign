package machineCoding.paymentRecommandationService;

public class Cart {
    private String lineOfBusiness; // CreditCardBillPayment, Commerce, Investment
    private double totalAmount;

    public Cart(String lineOfBusiness, double totalAmount) {
        this.lineOfBusiness = lineOfBusiness;
        this.totalAmount = totalAmount;
    }

    public String getLineOfBusiness() {
        return lineOfBusiness;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}
