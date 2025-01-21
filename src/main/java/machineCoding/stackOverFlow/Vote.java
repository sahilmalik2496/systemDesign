package machineCoding.stackOverFlow;

class Vote {
    private String userId;
    private String entityId; // Could be for a Question or an Answer
    private boolean isUpvote;

    public Vote(String userId, String entityId, boolean isUpvote) {
        this.userId = userId;
        this.entityId = entityId;
        this.isUpvote = isUpvote;
    }

    // Getters and setters
    public String getUserId() {
        return userId;
    }

    public String getEntityId() {
        return entityId;
    }

    public boolean isUpvote() {
        return isUpvote;
    }
}
