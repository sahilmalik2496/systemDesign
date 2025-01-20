package machineCoding.paymentRecommandationService;

import java.util.*;
import java.util.stream.Collectors;

public class PaymentRecommendationService {
    // Business rules
    private static final Map<String, Map<String, Double>> LINE_OF_BUSINESS_RULES = new HashMap<>() {{
        put("CreditCardBillPayment", Map.of(
                "UPI", 200000.0,
                "DebitCard", 200000.0,
                "NetBanking", 200000.0
        ));
        put("Commerce", Map.of(
                "CreditCard", 250000.0,
                "UPI", 100000.0,
                "DebitCard", 200000.0
        ));
        put("Investment", Map.of(
                "UPI", 100000.0,
                "DebitCard", 150000.0,
                "NetBanking", 150000.0
        ));
    }};

    private static final Map<String, List<String>> ORDERING_RULES = new HashMap<>() {{
        put("CreditCardBillPayment", List.of("UPI", "NetBanking", "DebitCard"));
        put("Commerce", List.of("CreditCard", "UPI", "DebitCard"));
        put("Investment", List.of("UPI", "NetBanking", "DebitCard"));
    }};

    public List<PaymentInstrument> recommendPayments(User user, Cart cart) {
        List<PaymentInstrument> availableInstruments = new ArrayList<>();
        Map<String, Double> rules = LINE_OF_BUSINESS_RULES.get(cart.getLineOfBusiness());
        List<String> ordering = ORDERING_RULES.get(cart.getLineOfBusiness());

        for (PaymentInstrument instrument : user.getPaymentInstruments()) {
            String type = instrument.getType();
            if (rules.containsKey(type) && cart.getTotalAmount() <= rules.get(type)) {
                if (!type.equals("UPI") || user.getUserContext().isUPIEnabled()) {
                    availableInstruments.add(instrument);
                }
            }
        }

        return availableInstruments;
    }
}
