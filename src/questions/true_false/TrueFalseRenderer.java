package questions.true_false;
import core.Question;
import core.QuestionRenderer;

public class TrueFalseRenderer implements QuestionRenderer {
    @Override
    public void render(Question q) {
        System.out.println("[True/False] "+q.getText());
        System.out.println("  A. True   B. False");
    }
}
