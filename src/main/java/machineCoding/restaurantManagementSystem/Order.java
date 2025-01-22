package machineCoding.restaurantManagementSystem;

import java.util.List;
import java.util.UUID;

class Order {
    private String orderId;
    private List<Dish> orderedDishes;
    private double totalAmount;
    private OrderStatus status;

    public Order(List<Dish> orderedDishes) {
        this.orderId = UUID.randomUUID().toString();
        this.orderedDishes = orderedDishes;
        this.totalAmount = calculateTotal();
        this.status = OrderStatus.PLACED;
    }

    double calculateTotal() {
        return orderedDishes.stream().mapToDouble(Dish::getPrice).sum();
    }

    public void updateStatus(OrderStatus status) {
        this.status = status;
    }

    public String getOrderDetails() {
        return "Order ID: " + orderId + ", Total: $" + totalAmount + ", Status: " + status;
    }
}
