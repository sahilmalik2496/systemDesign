package machineCoding.foodDelivery;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

// User Class
class User {
    private String userId;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private List<Order> orderHistory;

    public User(String userId, String name, String email, String address, String phoneNumber) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.orderHistory = new ArrayList<>();
    }

    public void placeOrder(Restaurant restaurant, List<Dish> dishes) {
        Order order = new Order(UUID.randomUUID().toString(), this.userId, restaurant.getRestaurantId(), dishes);
        order.calculateTotalPrice();
        restaurant.addOrder(order);
        orderHistory.add(order);
        System.out.println("Order placed successfully!");
    }
}
