package questions.mcq;
import core.Question;
import core.QuestionRenderer;

public class MCQRenderer implements QuestionRenderer {
    @Override
    public void render(Question q) {
        MCQQuestion mcq=(MCQQuestion)q;
        System.out.println("[MCQ] "+mcq.getText());
        String[] options=mcq.getOptions();
        for(int i=0; i<options.length; i++){
            System.out.println("  "+(char)('A' + i)+". "+options[i]);
        }
    }
}
