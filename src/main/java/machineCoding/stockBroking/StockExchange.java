package machineCoding.stockBroking;

import java.util.*;

public class StockExchange {
    private final User user;
    private Map<String, Stock> stocks = new HashMap<>();
    private List<Order> orderBook = new ArrayList<>();

    public StockExchange(User user) {
        this.user = user;
    }

    public void addStock(Stock stock) {
        stocks.put(stock.getStockId(), stock);
    }

    public Stock getStock(String stockId) {
        return stocks.get(stockId);
    }

    public void placeOrder(Order order) {
        orderBook.add(order);
        matchOrders(order);
    }

    private void matchOrders(Order newOrder) {
        Iterator<Order> iterator = orderBook.iterator();
        while (iterator.hasNext()) {
            Order existingOrder = iterator.next();

            if (!existingOrder.getStockId().equals(newOrder.getStockId())) continue;
            if (existingOrder.getType() == newOrder.getType()) continue;

            // Check for match
            if (newOrder.getType() == OrderType.BUY && newOrder.getPrice() >= existingOrder.getPrice() ||
                    newOrder.getType() == OrderType.SELL && newOrder.getPrice() <= existingOrder.getPrice()) {

                // Process trade
                int quantityTraded = Math.min(newOrder.getQuantity(), existingOrder.getQuantity());
                double tradePrice = existingOrder.getPrice();

                user.System.out.println("Trade executed: " + quantityTraded + " shares at " + tradePrice);

                // Update quantities
                newOrder.setQuantity(newOrder.getQuantity() - quantityTraded);
                existingOrder.setQuantity(existingOrder.getQuantity() - quantityTraded);

                if (existingOrder.getQuantity() == 0) iterator.remove();
                if (newOrder.getQuantity() == 0) break;
            }
        }
    }
}
