package machineCoding.faceBook;

import java.util.*;

class FeedService {
    public List<Post> generateFeed(User user) {
        List<Post> feed = new ArrayList<>();
        for (User friend : user.getFriends()) {
            feed.addAll(friend.getPosts());
        }
        feed.sort((p1, p2) -> p2.getPostDetails().compareTo(p1.getPostDetails())); // Sort by recency
        return feed;
    }
}
