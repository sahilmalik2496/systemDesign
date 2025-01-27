package machineCoding.vendingMachine;

import java.util.HashMap;
import java.util.Map;

class Inventory {
    private Map<String, Product> stock;

    public Inventory() {
        this.stock = new HashMap<>();
    }

    public void addProduct(Product product) {
        stock.put(product.getProductId(), product);
    }

    public Product getProduct(String productId) {
        return stock.getOrDefault(productId, null);
    }

    public void updateStock(String productId, int quantity) {
        Product product = stock.get(productId);
        if (product != null) {
            product.updateQuantity(quantity);
        }
    }

    public void displayProducts() {
        System.out.println("Available Products:");
        for (Product product : stock.values()) {
            System.out.println(product.getProductId() + ": " + product.getName() + " - ₹" + product.getPrice() + " (" + product.getQuantity() + " available)");
        }
    }
}
