package machineCoding.googleDocs;

public class Edit {
    private String userId;
    private String operation; // "insert" or "delete"
    private int position;
    private String text;

    public Edit(String userId, String operation, int position, String text) {
        this.userId = userId;
        this.operation = operation;
        this.position = position;
        this.text = text;
    }

    public String getOperation() {
        return operation;
    }

    public int getPosition() {
        return position;
    }

    public String getText() {
        return text;
    }
}
