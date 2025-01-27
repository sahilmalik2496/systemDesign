package machineCoding.whatsapp;

import java.util.Arrays;

// Main class to demonstrate functionality
public class WhatsAppSystem {
    public static void main(String[] args) {
        WhatsAppService service = new WhatsAppService();

        // Register users
        service.registerUser("u1", "Alice");
        service.registerUser("u2", "Bob");
        service.registerUser("u3", "Charlie");

        // Add contacts
        service.addContact("u1", "u2");
        service.addContact("u1", "u3");

        // Send one-on-one messages
        service.sendMessage("u1", "u2", "Hello Bob!");
        service.sendMessage("u2", "u1", "Hi Alice!");

        // Create a group
        service.createGroup("g1", "Friends", Arrays.asList("u1", "u2", "u3"));

        // Send a group message
        service.sendGroupMessage("g1", "u1", "Hi everyone!");

        // View messages
        service.viewMessages("u1");
        service.viewMessages("u2");
        service.viewMessages("u3");
    }
}
