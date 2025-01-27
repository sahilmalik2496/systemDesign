package machineCoding.whatsapp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// WhatsApp Service to manage users and groups
class WhatsAppService {
    private final Map<String, User> users;
    private final Map<String, Group> groups;

    public WhatsAppService() {
        this.users = new HashMap<>();
        this.groups = new HashMap<>();
    }

    // Register a new user
    public void registerUser(String userId, String name) {
        if (users.containsKey(userId)) {
            System.out.println("User already exists!");
        } else {
            users.put(userId, new User(userId, name));
            System.out.println("User registered: " + name);
        }
    }

    // Add a contact for a user
    public void addContact(String userId, String contactId) {
        User user = users.get(userId);
        User contact = users.get(contactId);
        if (user == null || contact == null) {
            System.out.println("Invalid user or contact!");
            return;
        }
        user.addContact(contactId);
        System.out.println("Contact added: " + contact.getName() + " to " + user.getName());
    }

    // Send a one-on-one message
    public void sendMessage(String fromUserId, String toUserId, String message) {
        User fromUser = users.get(fromUserId);
        User toUser = users.get(toUserId);
        if (fromUser == null || toUser == null) {
            System.out.println("Invalid sender or receiver!");
            return;
        }
        String formattedMessage = fromUser.getName() + ": " + message;
        toUser.receiveMessage(formattedMessage);
        System.out.println("Message sent from " + fromUser.getName() + " to " + toUser.getName());
    }

    // Create a new group
    public void createGroup(String groupId, String groupName, List<String> memberIds) {
        if (groups.containsKey(groupId)) {
            System.out.println("Group already exists!");
            return;
        }
        Group group = new Group(groupId, groupName);
        for (String memberId : memberIds) {
            if (users.containsKey(memberId)) {
                group.addMember(memberId);
            } else {
                System.out.println("Invalid member: " + memberId);
            }
        }
        groups.put(groupId, group);
        System.out.println("Group created: " + groupName);
    }

    // Send a message to a group
    public void sendGroupMessage(String groupId, String fromUserId, String message) {
        Group group = groups.get(groupId);
        User sender = users.get(fromUserId);
        if (group == null || sender == null || !group.getMembers().contains(fromUserId)) {
            System.out.println("Invalid group or sender!");
            return;
        }
        String formattedMessage = "Group " + group.getGroupName() + " - " + sender.getName() + ": " + message;
        group.sendGroupMessage(formattedMessage);
        for (String memberId : group.getMembers()) {
            if (!memberId.equals(fromUserId)) {
                users.get(memberId).receiveMessage(formattedMessage);
            }
        }
        System.out.println("Message sent to group: " + group.getGroupName());
    }

    // View messages for a user
    public void viewMessages(String userId) {
        User user = users.get(userId);
        if (user == null) {
            System.out.println("Invalid user!");
            return;
        }
        System.out.println("Messages for " + user.getName() + ":");
        for (String message : user.getMessages()) {
            System.out.println(message);
        }
    }
}
