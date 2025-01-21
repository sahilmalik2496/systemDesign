package machineCoding.stackOverFlow;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class Question {
    private String questionId;
    private String userId;
    private String content;
    private List<Tag> tags;
    private List<Answer> answers;
    private int upvotes;
    private int downvotes;
    private boolean acceptedAnswer;

    public Question(String questionId, String userId, String content) {
        this.questionId = questionId;
        this.userId = userId;
        this.content = content;
        this.upvotes = 0;
        this.downvotes = 0;
        this.acceptedAnswer = false;
    }

    // Getters and setters
    public String getQuestionId() {
        return questionId;
    }

    public String getUserId() {
        return userId;
    }

    public String getContent() {
        return content;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public int getUpvotes() {
        return upvotes;
    }

    public int getDownvotes() {
        return downvotes;
    }

    public boolean isAcceptedAnswer() {
        return acceptedAnswer;
    }

    public void markAnswerAsAccepted() {
        this.acceptedAnswer = true;
    }

    public void addTag(Tag tag) {
        tags.add(tag);
    }

    public void addAnswer(Answer answer) {
        answers.add(answer);
    }

    public void upvote() {
        this.upvotes++;
    }

    public void downvote() {
        this.downvotes++;
    }
}
