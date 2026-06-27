package questions.programming;
import core.*;
public class ProgrammingEvaluator implements QuestionEvaluator {
    @Override
    public int evaluate(Question q, String answer) {
        return (answer != null && !answer.trim().isEmpty()) ? q.getPoints() : 0;
    }
}
