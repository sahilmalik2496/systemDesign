package machineCoding.faceBook;

import java.util.*;

class Post {
    private String postId;
    private User author;
    private String content; // Text, image URL, video URL, etc.
    private List<User> likes; // Users who liked the post
    private List<Comment> comments; // Comments on the post

    public Post(String postId, User author, String content) {
        this.postId = postId;
        this.author = author;
        this.content = content;
        this.likes = new ArrayList<>();
        this.comments = new ArrayList<>();
    }

    public void likePost(User user) {
        if (!likes.contains(user)) {
            likes.add(user);
        }
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public String getPostDetails() {
        return String.format("Post by %s: %s\nLikes: %d\nComments: %d",
                author.getName(), content, likes.size(), comments.size());
    }
}
