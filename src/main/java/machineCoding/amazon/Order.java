package machineCoding.amazon;

import java.util.List;

class Order {
    private String orderId;
    private String userId;
    private List<Product> products;
    private double totalPrice;
    private String shippingAddress;
    private OrderStatus status;

    // Constructor
    public Order(String orderId, String userId, List<Product> products, double totalPrice, String shippingAddress) {
        this.orderId = orderId;
        this.userId = userId;
        this.products = products;
        this.totalPrice = totalPrice;
        this.shippingAddress = shippingAddress;
        this.status = OrderStatus.PENDING;
    }

    // Getters and setters
    public String getOrderId() {
        return orderId;
    }

    public String getUserId() {
        return userId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void updateStatus(OrderStatus status) {
        this.status = status;
    }
}

