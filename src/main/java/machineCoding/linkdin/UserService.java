package machineCoding.linkdin;

import java.util.HashMap;
import java.util.Map;

class UserService {
    private final User user;
    private final Map<String, User> users;

    public UserService(User user) {
        this.user = user;
        this.users = new HashMap<>();
    }

    public User createUser(String userId, String name, String email) {
        if (users.containsKey(userId)) {
            throw new IllegalArgumentException("User already exists!");
        }
        User user = new User(userId, name, email);
        users.put(userId, user);
        return user;
    }

    public User getUser(String userId) {
        if (!users.containsKey(userId)) {
            throw new IllegalArgumentException("User does not exist!");
        }
        return users.get(userId);
    }

    public void updateUserHeadline(String userId, String headline) {
        User user = getUser(userId);
        user.setHeadline(headline);
    }

    public void addSkillToUser(String userId, String skill) {
        User user = getUser(userId);
        user.addSkill(skill);
    }

    public Map<String, User> getAllUsers() {
        return users;
    }
}
