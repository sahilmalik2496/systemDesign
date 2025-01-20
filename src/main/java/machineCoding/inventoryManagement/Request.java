package machineCoding.inventoryManagement;

public abstract class Request {
    private String id;
    private RequestType type;

    public Request(String id, RequestType type) {
        this.id = id;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public RequestType getType() {
        return type;
    }

    public abstract void execute(InventoryManager inventoryManager);
}
