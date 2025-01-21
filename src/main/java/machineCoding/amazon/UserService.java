package machineCoding.amazon;

import java.util.HashMap;
import java.util.Map;

class UserService {
    private Map<String, User> users;

    public UserService() {
        this.users = new HashMap<>();
    }

    public User registerUser(String userId, String name, String email, String password, String address, PaymentMethod paymentMethod) {
        User user = new User(userId, name, email, password, address, paymentMethod);
        users.put(userId, user);
        return user;
    }

    public User getUserById(String userId) {
        return users.get(userId);
    }
}

