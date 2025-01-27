package machineCoding.whatsapp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// User class to store user details
class User {
    private final String userId;
    private String name;
    private final Set<String> contacts;
    private final List<String> messages;

    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
        this.contacts = new HashSet<>();
        this.messages = new ArrayList<>();
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getContacts() {
        return contacts;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void addContact(String contactId) {
        contacts.add(contactId);
    }

    public void receiveMessage(String message) {
        messages.add(message);
    }
}
