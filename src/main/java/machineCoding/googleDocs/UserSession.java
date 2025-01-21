package machineCoding.googleDocs;

public class UserSession {
    private String userId;
    private String documentId;
    private Server server;

    public UserSession(String userId, String documentId, Server server) {
        this.userId = userId;
        this.documentId = documentId;
        this.server = server;
    }

    public void sendEdit(Edit edit) {
        server.handleEdit(edit, documentId);
    }

    public void receiveUpdate(Edit edit) {
        System.out.println("Update received: " + edit.getOperation() + " at " + edit.getPosition());
    }
}

