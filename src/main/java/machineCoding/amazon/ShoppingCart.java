package machineCoding.amazon;

import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
    private String cartId;
    private List<Product> products;

    public ShoppingCart(String cartId) {
        this.cartId = cartId;
        this.products = new ArrayList<>();
    }

    public String getCartId() {
        return cartId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}

