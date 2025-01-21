package machineCoding.amazon;

class Product {
    private String productId;
    private String name;
    private double price;
    private int stockQuantity;
    private String description;
    private String category;

    // Constructor
    public Product(String productId, String name, double price, int stockQuantity, String description, String category) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.description = description;
        this.category = category;
    }

    // Getters and setters
    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public void updateStock(int newStock) {
        this.stockQuantity = newStock;
    }
}
