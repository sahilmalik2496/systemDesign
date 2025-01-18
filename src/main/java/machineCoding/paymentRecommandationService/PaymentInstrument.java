package machineCoding.paymentRecommandationService;

public class PaymentInstrument {
    private String identifier;
    private String type; // CreditCard, UPI, DebitCard, NetBanking
    private String issuer; // HDFC, AMEX, SBI, etc.
    private double relevanceScore; // Between 0 to 1

    public PaymentInstrument(String identifier, String type, String issuer, double relevanceScore) {
        this.identifier = identifier;
        this.type = type;
        this.issuer = issuer;
        this.relevanceScore = relevanceScore;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getType() {
        return type;
    }

    public double getRelevanceScore() {
        return relevanceScore;
    }

    @Override
    public String toString() {
        return "PaymentInstrument{" +
                "identifier='" + identifier + '\'' +
                ", type='" + type + '\'' +
                ", relevanceScore=" + relevanceScore +
                '}';
    }
}
