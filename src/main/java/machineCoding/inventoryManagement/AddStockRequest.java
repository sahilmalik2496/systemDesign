package machineCoding.inventoryManagement;

public class AddStockRequest extends Request {
    private String itemId;
    private int quantity;

    public AddStockRequest(String id, String itemId, int quantity) {
        super(id, RequestType.ADD_STOCK);
        this.itemId = itemId;
        this.quantity = quantity;
    }

    @Override
    public void execute(InventoryManager inventoryManager) {
        InventoryItem item = inventoryManager.getItem(itemId);
        if (item != null) {
            item.updateQuantity(quantity);
            System.out.println("Added " + quantity + " units to " + itemId);
        } else {
            System.out.println("Item not found: " + itemId);
        }
    }
}

