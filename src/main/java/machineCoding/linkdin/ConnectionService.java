package machineCoding.linkdin;

import java.util.Set;

class ConnectionService {
    private final UserService userService;

    public ConnectionService(UserService userService) {
        this.userService = userService;
    }

    public void addConnection(String userId1, String userId2) {
        User user1 = userService.getUser(userId1);
        User user2 = userService.getUser(userId2);

        user1.addConnection(userId2);
        user2.addConnection(userId1);
    }

    public Set<String> getConnections(String userId) {
        User user = userService.getUser(userId);
        return user.getConnections();
    }
}
