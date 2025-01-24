package machineCoding.faceBook;

import java.util.*;

class Comment {
    private String commentId;
    private User author;
    private String content;
    private Date timestamp;

    public Comment(String commentId, User author, String content) {
        this.commentId = commentId;
        this.author = author;
        this.content = content;
        this.timestamp = new Date();
    }

    public String getCommentDetails() {
        return String.format("Comment by %s: %s", author.getName(), content);
    }
}
