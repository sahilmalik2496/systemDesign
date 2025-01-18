package machineCoding.paymentRecommandationService;

import java.util.Arrays;
import java.util.List;
/*

Requirement Question:

How would you design a payment recommendation system for an e-commerce platform that:

Suggests the most relevant payment instruments (e.g., Credit Card, UPI, Debit Card, NetBanking) based on user preferences, cart details, and business rules?
Considers specific constraints like transaction limits, device capabilities (e.g., UPI-enabled), and regulatory compliance?
Supports dynamic ordering of payment options based on predefined relevance scores and business logic for lines of business (e.g., Credit Card bill payments, Commerce purchases, Investments)?
Is extensible to accommodate new lines of business or payment instruments in the future?

Key Features
Scalability:

New lines of business or payment instruments can be added by modifying the rules in LINE_OF_BUSINESS_RULES and ORDERING_RULES.
Sorting:

Instruments are sorted by their relevance score and pre-defined ordering logic.
UPI Context Check:

Payments via UPI are validated based on the user's device context.
Dynamic Rules:

The LINE_OF_BUSINESS_RULES allows for easy adjustment of transaction limits.

 */


public class PaymentRecommendationSystem {
    public static void main(String[] args) {
        // User context
        UserContext userContext = new UserContext(true);

        // Payment instruments
        List<PaymentInstrument> instruments = Arrays.asList(
                new PaymentInstrument("UPI1", "UPI", "HDFC", 0.9),
                new PaymentInstrument("UPI2", "UPI", "SBI", 0.8),
                new PaymentInstrument("CC1", "CreditCard", "AMEX", 0.7),
                new PaymentInstrument("DC1", "DebitCard", "CITI", 0.85),
                new PaymentInstrument("NB1", "NetBanking", "ICICI", 0.75)
        );

        // User
        User user = new User("User1", userContext, instruments);

        // Cart
        Cart cart = new Cart("Commerce", 80000);

        // Recommendation service
        PaymentRecommendationService recommendationService = new PaymentRecommendationService();
        List<PaymentInstrument> recommendedPayments = recommendationService.recommendPayments(user, cart);

        // Output recommendations
        System.out.println("Recommended Payment Instruments:");
        for (PaymentInstrument instrument : recommendedPayments) {
            System.out.println(instrument);
        }
    }
}
