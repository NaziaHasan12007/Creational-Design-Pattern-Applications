package questions.essay;

import core.Question;
import core.QuestionEvaluator;

public class EssayEvaluator implements QuestionEvaluator {
    @Override
    public int evaluate(Question q, String answer) {
        EssayQuestion essay = (EssayQuestion) q;
        int wordCount = answer.trim().split("\\s+").length;
        return wordCount >= essay.getMinWords() ? essay.getPoints() : essay.getPoints() / 2;
    }
}
