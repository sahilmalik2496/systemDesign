package machineCoding.amazon;

import java.util.HashMap;
import java.util.Map;

class ProductService {
    private Map<String, Product> products;

    public ProductService() {
        this.products = new HashMap<>();
    }

    public Product addProduct(String productId, String name, double price, int stockQuantity, String description, String category) {
        Product product = new Product(productId, name, price, stockQuantity, description, category);
        products.put(productId, product);
        return product;
    }

    public Product getProductById(String productId) {
        return products.get(productId);
    }

    public void updateProductStock(String productId, int stock) {
        Product product = products.get(productId);
        if (product != null) {
            product.updateStock(stock);
        }
    }
}

