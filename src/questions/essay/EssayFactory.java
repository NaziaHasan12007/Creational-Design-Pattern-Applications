package questions.essay;

import core.Question;
import core.QuestionEvaluator;
import core.QuestionFactory;
import core.QuestionRenderer;
import source.QuestionSource;

public class EssayFactory implements QuestionFactory {
    private QuestionSource source;

    public EssayFactory(QuestionSource source) { this.source = source; }

    @Override public Question          createQuestion()  { return source.getQuestion(); }
    @Override public QuestionRenderer createRenderer()  { return new EssayRenderer(); }
    @Override public QuestionEvaluator createEvaluator() { return new EssayEvaluator(); }

}
