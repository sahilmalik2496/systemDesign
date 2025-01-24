package machineCoding.linkdin;

class Comment {
    private final String userId;
    private final String text;

    public Comment(String userId, String text) {
        this.userId = userId;
        this.text = text;
    }

    public String getUserId() {
        return userId;
    }

    public String getText() {
        return text;
    }
}
