package machineCoding.linkdin;

import java.util.HashMap;
import java.util.Map;

class PostService {
    private final Map<String, Post> posts;

    public PostService() {
        this.posts = new HashMap<>();
    }

    public Post createPost(String postId, String authorId, String content) {
        Post post = new Post(postId, authorId, content);
        posts.put(postId, post);
        return post;
    }

    public void likePost(String postId, String userId) {
        Post post = posts.get(postId);
        if (post == null) throw new IllegalArgumentException("Post not found!");
        post.addLike(userId);
    }

    public void commentOnPost(String postId, String userId, String commentText) {
        Post post = posts.get(postId);
        if (post == null) throw new IllegalArgumentException("Post not found!");
        post.addComment(userId, commentText);
    }
}
