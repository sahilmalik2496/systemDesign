package machineCoding.faceBook;

import java.util.*;

class User {
    private String userId;
    private String name;
    private String email;
    private List<User> friends; // Bidirectional relationships
    private List<Post> posts;   // User's posts

    public User(String userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.friends = new ArrayList<>();
        this.posts = new ArrayList<>();
    }

    public void addFriend(User user) {
        if (!friends.contains(user)) {
            friends.add(user);
            user.friends.add(this); // Bidirectional relationship
        }
    }

    public void addPost(Post post) {
        posts.add(post);
    }

    public List<Post> getPosts() {
        return posts;
    }

    public List<User> getFriends() {
        return friends;
    }

    public String getName() {
        return name;
    }
}