package questions.mcq;
import core.QuestionEvaluator;
import core.Question;

public class MCQEvaluator implements QuestionEvaluator {
    @Override
    public int evaluate(Question q, String answer) {
        MCQQuestion mcq = (MCQQuestion) q;
        int chosen = answer.trim().toUpperCase().charAt(0) - 'A';
        return chosen == mcq.getCorrectIndex() ? mcq.getPoints() : 0;
    }
}
