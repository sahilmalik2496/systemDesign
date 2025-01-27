package machineCoding.foodDelivery;

import java.util.ArrayList;
import java.util.List;

// Restaurant Class
class Restaurant {
    private String restaurantId;
    private String name;
    private String address;
    private double rating;
    private Menu menu;
    private List<Order> orders;

    public Restaurant(String restaurantId, String name, String address, double rating, Menu menu) {
        this.restaurantId = restaurantId;
        this.name = name;
        this.address = address;
        this.rating = rating;
        this.menu = menu;
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public Menu getMenu() {
        return menu;
    }
}
