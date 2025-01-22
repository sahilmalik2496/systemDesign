package machineCoding.stockBroking;

public class Order {
    private String orderId;
    private String userId;
    private String stockId;
    private int quantity;
    private double price;
    private OrderType type; // BUY or SELL

    public Order(String orderId, String userId, String stockId, int quantity, double price, OrderType type) {
        this.orderId = orderId;
        this.userId = userId;
        this.stockId = stockId;
        this.quantity = quantity;
        this.price = price;
        this.type = type;
    }

    public String getStockId() {
        return stockId;
    }

    public OrderType getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}
