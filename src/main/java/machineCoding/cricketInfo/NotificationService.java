package machineCoding.cricketInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class NotificationService {
    private Map<String, List<String>> userSubscriptions; // Key: MatchId, Value: List of Users

    public NotificationService() {
        userSubscriptions = new HashMap<>();
    }

    public void subscribe(String userId, String matchId) {
        userSubscriptions.putIfAbsent(matchId, new ArrayList<>());
        userSubscriptions.get(matchId).add(userId);
    }

    public void notifyUsers(String matchId, String message) {
        if (userSubscriptions.containsKey(matchId)) {
            for (String userId : userSubscriptions.get(matchId)) {
                System.out.println("Notifying user " + userId + ": " + message);
            }
        }
    }
}
