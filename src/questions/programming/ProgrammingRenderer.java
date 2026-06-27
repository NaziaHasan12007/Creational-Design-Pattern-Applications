package questions.programming;

import core.QuestionRenderer;
import core.Question;
public class ProgrammingRenderer implements QuestionRenderer {
    @Override
    public void render(Question q) {
        ProgrammingQuestion pq = (ProgrammingQuestion) q;
        System.out.println("[Programming - " + pq.getLanguage() + "] " + pq.getText());
    }
}
