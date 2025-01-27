package machineCoding.whatsapp;

import java.util.*;

// Group class to manage group details
class Group {
    private final String groupId;
    private String groupName;
    private final Set<String> members;
    private final List<String> groupMessages;

    public Group(String groupId, String groupName) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.members = new HashSet<>();
        this.groupMessages = new ArrayList<>();
    }

    public String getGroupId() {
        return groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Set<String> getMembers() {
        return members;
    }

    public List<String> getGroupMessages() {
        return groupMessages;
    }

    public void addMember(String userId) {
        members.add(userId);
    }

    public void sendGroupMessage(String message) {
        groupMessages.add(message);
    }
}

