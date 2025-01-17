package machineCoding.notificationService;

import java.util.*;

public class LOBManager {
    private final Map<String, List<User>> lobToUsersMap;

    public LOBManager() {
        this.lobToUsersMap = new HashMap<>();
    }

    public void addUserToLOB(String lob, User user) {
        lobToUsersMap.computeIfAbsent(lob, k -> new ArrayList<>()).add(user);
    }

    public List<User> getUsersByLOB(String lob) {
        return lobToUsersMap.getOrDefault(lob, Collections.emptyList());
    }
}
