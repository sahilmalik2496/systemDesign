package machineCoding.linkdin;

import java.util.*;

class User {
    private final String userId;
    private String name;
    private String email;
    private String headline;
    private List<String> skills;
    private Set<String> connections;

    public User(String userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.headline = "";
        this.skills = new ArrayList<>();
        this.connections = new HashSet<>();
    }

    // Getters and Setters
    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getHeadline() {
        return headline;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void addSkill(String skill) {
        skills.add(skill);
    }

    public Set<String> getConnections() {
        return connections;
    }

    public void addConnection(String userId) {
        connections.add(userId);
    }
}