package machineCoding.userVisitTracker;

import java.util.*;

public class UserVisitTracker {
    // LinkedHashMap maintains insertion order
    private final LinkedHashMap<String, Integer> userVisits;

    public UserVisitTracker() {
        this.userVisits = new LinkedHashMap<>();
    }

    // API 1: Track user visits
    public void trackVisit(String userId) {
        userVisits.put(userId, userVisits.getOrDefault(userId, 0) + 1);
    }

    // API 2: Return the first user who visited only once
    public String getFirstUniqueUser() {
        for (Map.Entry<String, Integer> entry : userVisits.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return null; // No unique user found
    }

    // Follow-up: Return the first N users who visited only once
    public List<String> getFirstNUniqueUsers(int n) {
        List<String> uniqueUsers = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : userVisits.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueUsers.add(entry.getKey());
                if (uniqueUsers.size() == n) {
                    break;
                }
            }
        }
        return uniqueUsers;
    }

    public static void main(String[] args) {
        UserVisitTracker tracker = new UserVisitTracker();

        // Track visits
        tracker.trackVisit("User1");
        tracker.trackVisit("User2");
        tracker.trackVisit("User3");
        tracker.trackVisit("User2");
        tracker.trackVisit("User4");
        tracker.trackVisit("User5");
        tracker.trackVisit("User3");

        // Get the first unique user
        System.out.println("First unique user: " + tracker.getFirstUniqueUser()); // Output: User1

        // Get the first 2 unique users
        List<String> firstTwoUniqueUsers = tracker.getFirstNUniqueUsers(2);
        System.out.println("First 2 unique users: " + firstTwoUniqueUsers); // Output: [User1, User4]
    }
}
