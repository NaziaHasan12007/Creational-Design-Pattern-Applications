package questions.true_false;
import core.*;
import source.QuestionSource;

public class TrueFalseFactory implements QuestionFactory {
    private QuestionSource source;

    public TrueFalseFactory(QuestionSource source) { this.source = source; }

    @Override public Question          createQuestion()  { return source.getQuestion(); }
    @Override public QuestionRenderer  createRenderer()  { return new TrueFalseRenderer(); }
    @Override public QuestionEvaluator createEvaluator() { return new TrueFalseEvaluator(); }
}
