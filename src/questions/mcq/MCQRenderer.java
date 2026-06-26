package questions.mcq;
import core.Question;
import core.QuestionRenderer;

public class MCQRenderer implements QuestionRenderer {
    @Override
    public void render(Question q) {
        MCQQuestion mcq = (MCQQuestion) q;
        System.out.println("[MCQ] " + mcq.getText());
        String[] opts = mcq.getOptions();
        for (int i = 0; i < opts.length; i++) {
            System.out.println("  " + (char)('A' + i) + ". " + opts[i]);
        }
    }
}
