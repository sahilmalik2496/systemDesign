package machineCoding.amazon;

import java.util.HashMap;
import java.util.Map;

class PaymentService {
    private Map<String, Payment> payments;

    public PaymentService() {
        this.payments = new HashMap<>();
    }

    public Payment processPayment(String paymentId, String userId, double amount, PaymentMethod paymentMethod) {
        Payment payment = new Payment(paymentId, userId, amount, paymentMethod);
        payments.put(paymentId, payment);
        payment.processPayment();
        return payment;
    }
}

