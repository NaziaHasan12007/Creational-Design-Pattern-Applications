package questions.true_false;
import core.Question;
import core.QuestionEvaluator;
public class TrueFalseEvaluator implements QuestionEvaluator {
    @Override
    public int evaluate(Question q, String answer) {
        TrueFalseQuestion tf = (TrueFalseQuestion) q;
        boolean given = answer.trim().equalsIgnoreCase("true");
        return given == tf.getCorrectAnswer() ? tf.getPoints() : 0;
    }
}

