package machineCoding.faceBook;


import java.util.List;

public class FacebookApp {
    private final User user;

    public FacebookApp(User user) {
        this.user = user;
    }

    public static void main(String[] args) {
        // Create users
        User alice = new User("1", "Alice", "alice@example.com");
        User bob = new User("2", "Bob", "bob@example.com");

        // Friendship
        alice.addFriend(bob);

        // Posts
        Post post1 = new Post("101", alice, "Hello, World!");
        alice.addPost(post1);

        Post post2 = new Post("102", bob, "It's a sunny day!");
        bob.addPost(post2);

        // Like and comment
        post1.likePost(bob);
        post1.addComment(new Comment("201", bob, "Nice post!"));

        // Generate feed
        FeedService feedService = new FeedService();
        List<Post> feed = feedService.generateFeed(bob);

        // Display feed
        for (Post post : feed) {
            System.out.println(post.getPostDetails());
        }
    }
}
