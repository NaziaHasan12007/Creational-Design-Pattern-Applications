package questions.essay;

import core.Question;
import core.QuestionRenderer;

public class EssayRenderer implements QuestionRenderer {
    @Override
    public void render(Question q) {
        EssayQuestion essay = (EssayQuestion) q;
        System.out.println("[Essay] " + essay.getText());
        System.out.println("  (Minimum " + essay.getMinWords() + " words required)");
    }
}
