package machineCoding.stackOverFlow;

import java.util.HashMap;
import java.util.Map;
class QuestionService {
    private Map<String, Question> questions;

    public QuestionService() {
        questions = new HashMap<>();
    }

    public Question postQuestion(String userId, String content) {
        String questionId = "Q" + System.currentTimeMillis();
        Question question = new Question(questionId, userId, content);
        questions.put(questionId, question);
        return question;
    }

    public Question getQuestionById(String questionId) {
        return questions.get(questionId);
    }

    public void addAnswerToQuestion(String questionId, Answer answer) {
        Question question = questions.get(questionId);
        if (question != null) {
            question.addAnswer(answer);
        }
    }
}
