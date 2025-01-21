package machineCoding.stackOverFlow;

class Answer {
    private String answerId;
    private String userId;
    private String content;
    private int upvotes;
    private int downvotes;
    private boolean isAccepted;

    public Answer(String answerId, String userId, String content) {
        this.answerId = answerId;
        this.userId = userId;
        this.content = content;
        this.upvotes = 0;
        this.downvotes = 0;
        this.isAccepted = false;
    }

    // Getters and setters
    public String getAnswerId() {
        return answerId;
    }

    public String getUserId() {
        return userId;
    }

    public String getContent() {
        return content;
    }

    public int getUpvotes() {
        return upvotes;
    }

    public int getDownvotes() {
        return downvotes;
    }

    public boolean isAccepted() {
        return isAccepted;
    }

    public void upvote() {
        this.upvotes++;
    }

    public void downvote() {
        this.downvotes++;
    }

    public void markAsAccepted() {
        this.isAccepted = true;
    }
}
