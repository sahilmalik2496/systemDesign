package machineCoding.foodDelivery;

import java.util.List;

// Order Class
class Order {
    private String orderId;
    private String userId;
    private String restaurantId;
    private List<Dish> dishes;
    private double totalPrice;
    private String status;

    public Order(String orderId, String userId, String restaurantId, List<Dish> dishes) {
        this.orderId = orderId;
        this.userId = userId;
        this.restaurantId = restaurantId;
        this.dishes = dishes;
        this.status = "Pending";
    }

    public void calculateTotalPrice() {
        totalPrice = dishes.stream().mapToDouble(Dish::getPrice).sum();
    }
}
