package machineCoding.inventoryManagement;

public class Main {
    public static void main(String[] args) {
        InventoryManager inventoryManager = new InventoryManager();
        RequestQueue requestQueue = new RequestQueue(4);

        // Add initial items
        inventoryManager.addItem(new InventoryItem("1", "Laptop", 10, 50000));
        inventoryManager.addItem(new InventoryItem("2", "Phone", 20, 30000));

        // Create requests
        requestQueue.addRequest(new AddStockRequest("R1", "1", 5));
        requestQueue.addRequest(new AddStockRequest("R2", "2", 10));

        // Process requests
        requestQueue.processRequests(inventoryManager);

        // Generate and print inventory report
        System.out.println(inventoryManager.generateReport());

        // Shutdown request queue
        requestQueue.shutdown();
    }
}
