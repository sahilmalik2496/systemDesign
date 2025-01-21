package machineCoding.amazon;

import java.util.HashMap;
import java.util.Map;

class User {
    private String userId;
    private String name;
    private String email;
    private String password;
    private String address;
    private PaymentMethod paymentMethod;

    // Constructor
    public User(String userId, String name, String email, String password, String address, PaymentMethod paymentMethod) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
        this.paymentMethod = paymentMethod;
    }

    // Getters and setters
    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }
}

