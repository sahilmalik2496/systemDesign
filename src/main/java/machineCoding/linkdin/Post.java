package machineCoding.linkdin;

class Post {
    private final String postId;
    private final String authorId;
    private String content;
    private final Date createdAt;
    private final List<String> likes;
    private final List<Comment> comments;

    public Post(String postId, String authorId, String content) {
        this.postId = postId;
        this.authorId = authorId;
        this.content = content;
        this.createdAt = new Date();
        this.likes = new ArrayList<>();
        this.comments = new ArrayList<>();
    }

    // Getters and Post Interaction Methods
    public String getPostId() {
        return postId;
    }

    public void addLike(String userId) {
        likes.add(userId);
    }

    public void addComment(String userId, String commentText) {
        comments.add(new Comment(userId, commentText));
    }

    public List<Comment> getComments() {
        return comments;
    }
}

