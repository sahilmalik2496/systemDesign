package machineCoding.stackOverFlow;

import java.util.HashMap;
import java.util.Map;


class VotingService {
    private Map<String, Vote> votes;

    public VotingService() {
        votes = new HashMap<>();
    }

    public void upvote(String userId, String entityId) {
        Vote vote = new Vote(userId, entityId, true);
        votes.put(entityId + userId, vote);
        if (entityId.startsWith("Q")) {
            Question question = new QuestionService().getQuestionById(entityId);
            question.upvote();
        } else {
            Answer answer = new AnswerService().getAnswerById(entityId);
            answer.upvote();
        }
    }

    public void downvote(String userId, String entityId) {
        Vote vote = new Vote(userId, entityId, false);
        votes.put(entityId + userId, vote);
        if (entityId.startsWith("Q")) {
            Question question = new QuestionService().getQuestionById(entityId);
            question.downvote();
        } else {
            Answer answer = new AnswerService().getAnswerById(entityId);
            answer.downvote();
        }
    }
}
