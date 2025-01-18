package machineCoding.paymentRecommandationService;

import java.util.List;

public class User {
    private String userId;
    private UserContext userContext;
    private List<PaymentInstrument> paymentInstruments;

    public User(String userId, UserContext userContext, List<PaymentInstrument> paymentInstruments) {
        this.userId = userId;
        this.userContext = userContext;
        this.paymentInstruments = paymentInstruments;
    }

    public UserContext getUserContext() {
        return userContext;
    }

    public List<PaymentInstrument> getPaymentInstruments() {
        return paymentInstruments;
    }
}
