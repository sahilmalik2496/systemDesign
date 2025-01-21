package machineCoding.stackOverFlow;

public class StackOverflow {
    private final User user;

    public StackOverflow(User user) {
        this.user = user;
    }

    public static void main(String[] args) {
        // Initialize services
        User user = new User("U1", "Alice", "alice@example.com", "password", UserRole.REGULAR);
        QuestionService questionService = new QuestionService();
        AnswerService answerService = new AnswerService();
        VotingService votingService = new VotingService();

        // Post a question
        Question question = questionService.postQuestion(user.getUserId(), "What is polymorphism in Java?");

        // Post an answer
        Answer answer = answerService.postAnswer("U2", question.getQuestionId(), "Polymorphism allows one object to behave in multiple ways.");

        // Upvote the question and answer
        votingService.upvote("U3", question.getQuestionId());
        votingService.upvote("U4", answer.getAnswerId());

        // Display question and answers
        System.out.println("Question: " + question.getContent());
        System.out.println("Answer: " + answer.getContent());
        System.out.println("Question Upvotes: " + question.getUpvotes());
        System.out.println("Answer Upvotes: " + answer.getUpvotes());
    }
}
