package LLD.designPatterns.observerPattern;

public class NotificationSystem {
    public static void main(String[] args) {
        Product product = new Product("Apple iPhone 15 Pro");

        Customer sahil = new Customer("Sahil");
        Customer shweta = new Customer("Shweta");

        product.registerObserver(sahil);
        product.registerObserver(shweta);

        System.out.println("Product is out of stock initially...");
        product.setInStock(false);  // No notification

        System.out.println("\nProduct comes back in stock...");
        product.setInStock(true);   // Triggers notification
    }
}

