package machineCoding.restaurantManagementSystem;

import java.util.UUID;

class Customer {
    private String customerId;
    private String name;
    private String phone;

    public Customer(String name, String phone) {
        this.customerId = UUID.randomUUID().toString();
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }
}
