package machineCoding.vendingMachine;

class VendingMachine {
    private Inventory inventory;
    private PaymentProcessor paymentProcessor;

    public VendingMachine() {
        this.inventory = new Inventory();
        this.paymentProcessor = new PaymentProcessor();
    }

    public void addProduct(String productId, String name, int price, int quantity) {
        inventory.addProduct(new Product(productId, name, price, quantity));
    }

    public void displayProducts() {
        inventory.displayProducts();
    }

    public void insertMoney(int amount) {
        paymentProcessor.acceptPayment(amount);
        System.out.println("₹" + amount + " inserted.");
    }

    public void selectProduct(String productId) {
        Product product = inventory.getProduct(productId);
        if (product == null) {
            System.out.println("Invalid product selection.");
            return;
        }
        if (product.getQuantity() <= 0) {
            System.out.println("Product out of stock.");
            return;
        }
        if (!paymentProcessor.isPaymentSufficient(product.getPrice())) {
            System.out.println("Insufficient payment. Please insert more money.");
            return;
        }

        dispenseProduct(product);
    }

    private void dispenseProduct(Product product) {
        System.out.println("Dispensing " + product.getName());
        inventory.updateStock(product.getProductId(), product.getQuantity() - 1);
        int change = paymentProcessor.refundBalance(product.getPrice());
        if (change > 0) {
            System.out.println("Refunding ₹" + change + " as change.");
        }
    }
}
