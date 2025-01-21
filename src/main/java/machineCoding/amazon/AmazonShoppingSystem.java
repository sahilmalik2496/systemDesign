package machineCoding.amazon;

public class AmazonShoppingSystem {
    public static void main(String[] args) {
        // Initialize services
        UserService userService = new UserService();
        ProductService productService = new ProductService();
        OrderService orderService = new OrderService();
        PaymentService paymentService = new PaymentService();

        // Register user
        User user = userService.registerUser("U1", "John Doe", "john@example.com", "password123", "123 Street, City", PaymentMethod.CREDIT_CARD);

        // Add products
        productService.addProduct("P1", "Laptop", 1200, 10, "Dell Laptop", "Electronics");
        productService.addProduct("P2", "Headphone", 200, 20, "Sony Headphones", "Electronics");

        // Create shopping cart and add products
        ShoppingCart cart = new ShoppingCart("C1");
        cart.addProduct(productService.getProductById("P1"));
        cart.addProduct(productService.getProductById("P2"));

        // Create order
        Order order = orderService.createOrder(user, cart, "123 Street, City");

        // Process payment
        Payment payment = paymentService.processPayment("PAY123", user.getUserId(), cart.calculateTotalPrice(), PaymentMethod.CREDIT_CARD);

        // Print order details
        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Total Price: $" + order.getTotalPrice());
        System.out.println("Order Status: " + order.getStatus());
        System.out.println("Payment Status: " + payment.getStatus());
    }
}

