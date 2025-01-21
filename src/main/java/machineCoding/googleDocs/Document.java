package machineCoding.googleDocs;

import java.util.concurrent.locks.ReentrantLock;

public class Document {
    private String id;
    private StringBuilder content;
    private int version;
    private final ReentrantLock lock = new ReentrantLock();

    public Document(String id, String initialContent) {
        this.id = id;
        this.content = new StringBuilder(initialContent);
        this.version = 0;
    }

    public void applyEdit(Edit edit) {
        lock.lock();
        try {
            if (edit.getOperation().equals("insert")) {
                content.insert(edit.getPosition(), edit.getText());
            } else if (edit.getOperation().equals("delete")) {
                content.delete(edit.getPosition(), edit.getPosition() + edit.getText().length());
            }
            version++;
        } finally {
            lock.unlock();
        }
    }

    public String getContent() {
        lock.lock();
        try {
            return content.toString();
        } finally {
            lock.unlock();
        }
    }

    public int getVersion() {
        return version;
    }
}
