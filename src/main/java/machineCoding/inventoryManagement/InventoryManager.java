package machineCoding.inventoryManagement;

import java.util.*;

public class InventoryManager {
    private final Map<String, InventoryItem> inventory = new HashMap<>();

    public synchronized void addItem(InventoryItem item) {
        inventory.put(item.getId(), item);
    }

    public synchronized void removeItem(String itemId) {
        inventory.remove(itemId);
    }

    public synchronized void updateItem(String itemId, InventoryItem newItem) {
        inventory.put(itemId, newItem);
    }

    public synchronized InventoryItem getItem(String itemId) {
        return inventory.get(itemId);
    }

    public synchronized String generateReport() {
        StringBuilder report = new StringBuilder("Inventory Report:\n");
        for (InventoryItem item : inventory.values()) {
            report.append(item.toString()).append("\n");
        }
        return report.toString();
    }
}
