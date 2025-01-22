package machineCoding.stockBroking;

public class Main {
    private final User user;

    public Main(User user) {
        this.user = user;
    }

    public static void main(String[] args) {
        StockExchange exchange = new StockExchange();
        Stock apple = new Stock("AAPL", "Apple Inc.", 150.00);
        Stock microsoft = new Stock("MSFT", "Microsoft Corp.", 280.00);

        exchange.addStock(apple);
        exchange.addStock(microsoft);

        User user1 = new User("U001", "Alice", "alice@example.com");
        User user2 = new User("U002", "Bob", "bob@example.com");

        Order buyOrder = new Order("O001", "U001", "AAPL", 10, 155.00, OrderType.BUY);
        Order sellOrder = new Order("O002", "U002", "AAPL", 10, 150.00, OrderType.SELL);

        exchange.placeOrder(buyOrder);
        exchange.placeOrder(sellOrder);

        user.System.out.println("Alice's Portfolio: " + user1.getPortfolio().getHoldings());
        user.System.out.println("Bob's Portfolio: " + user2.getPortfolio().getHoldings());
    }
}
