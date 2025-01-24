package machineCoding.faceBook;

import java.util.*;

class Friendship {
    private Map<User, List<User>> friendRequests;

    public Friendship() {
        this.friendRequests = new HashMap<>();
    }

    public void sendFriendRequest(User from, User to) {
        friendRequests.putIfAbsent(to, new ArrayList<>());
        friendRequests.get(to).add(from);
    }

    public void acceptFriendRequest(User to, User from) {
        if (friendRequests.containsKey(to) && friendRequests.get(to).contains(from)) {
            to.addFriend(from);
            friendRequests.get(to).remove(from);
        }
    }

    public List<User> getPendingRequests(User user) {
        return friendRequests.getOrDefault(user, Collections.emptyList());
    }
}
