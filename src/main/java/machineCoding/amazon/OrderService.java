package machineCoding.amazon;

import java.util.HashMap;
import java.util.Map;

class OrderService {
    private Map<String, Order> orders;

    public OrderService() {
        this.orders = new HashMap<>();
    }

    public Order createOrder(User user, ShoppingCart cart, String shippingAddress) {
        String orderId = "ORD" + System.currentTimeMillis();
        Order order = new Order(orderId, user.getUserId(), cart.getProducts(), cart.calculateTotalPrice(), shippingAddress);
        orders.put(orderId, order);
        return order;
    }

    public Order getOrderById(String orderId) {
        return orders.get(orderId);
    }
}
