package machineCoding.googleDocs;

import java.util.*;

public class Server {
    private Map<String, Document> documents = new HashMap<>();
    private Map<String, List<UserSession>> sessions = new HashMap<>();

    public void handleEdit(Edit edit, String documentId) {
        Document document = documents.get(documentId);
        if (document == null) throw new IllegalArgumentException("Document not found");

        document.applyEdit(edit);
        broadcastUpdate(edit, documentId);
    }

    public void broadcastUpdate(Edit edit, String documentId) {
        List<UserSession> sessionList = sessions.get(documentId);
        if (sessionList != null) {
            for (UserSession session : sessionList) {
                session.receiveUpdate(edit);
            }
        }
    }

    public void addDocument(Document document) {
        documents.put(document.getId(), document);
    }

    public void addUserSession(String documentId, UserSession session) {
        sessions.computeIfAbsent(documentId, k -> new ArrayList<>()).add(session);
    }
}
