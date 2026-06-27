package questions.programming;

import core.QuestionFactory;
import core.*;
import source.QuestionSource;

public class ProgrammingFactory implements QuestionFactory {
    private QuestionSource source;

    public ProgrammingFactory(QuestionSource source) { this.source = source; }

    @Override public Question          createQuestion()  { return source.getQuestion(); }
    @Override public QuestionRenderer  createRenderer()  { return new ProgrammingRenderer(); }
    @Override public QuestionEvaluator createEvaluator() { return new ProgrammingEvaluator(); }
}
