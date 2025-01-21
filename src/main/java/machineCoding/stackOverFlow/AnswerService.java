package machineCoding.stackOverFlow;

import java.util.HashMap;
import java.util.Map;

class AnswerService {
    private Map<String, Answer> answers;

    public AnswerService() {
        answers = new HashMap<>();
    }

    public Answer postAnswer(String userId, String questionId, String content) {
        String answerId = "A" + System.currentTimeMillis();
        Answer answer = new Answer(answerId, userId, content);
        answers.put(answerId, answer);
        return answer;
    }

    public Answer getAnswerById(String answerId) {
        return answers.get(answerId);
    }
}
