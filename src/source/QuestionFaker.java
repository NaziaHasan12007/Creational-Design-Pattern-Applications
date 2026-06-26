package source;
import core.*;
import questions.mcq.*;
import questions.essay.*;
import questions.true_false.*;
import questions.programming.*;
import java.util.Random;

public class QuestionFaker {
    private static final Random rng=new Random();

    private static final String[] MCQ_TEXTS={
            "Which concept describes hiding internal state in OOP?",
            "What keyword is used to inherit a class in Java?",
    };
    private static final String[] TF_TEXTS={
            "The Builder pattern is a creational design pattern.",
            "A static method can be overridden in Java.",
    };
    private static final String[] ESSAY_TEXTS={
            "Discuss the advantages of the Builder pattern over telescoping constructors.",
            "Analyze how the Abstract Factory promotes the Open/Closed Principle.",
    };
    private static final String[] PROG_TEXTS={
            "Implement a Singleton class that is thread-safe.",
            "Write a Builder pattern for constructing an HTTP request object.",
    };
    public static Question fakeMCQ(){
        return new MCQQuestion(
                MCQ_TEXTS[rng.nextInt(MCQ_TEXTS.length)], 2, rng.nextBoolean() ? "Easy" : "Medium", new String[]{"Option A", "Option B", "Option C", "Option D"}, rng.nextInt(4));
    }
    public static Question fakeTrueFalse(){
        return new TrueFalseQuestion(TF_TEXTS[rng.nextInt(TF_TEXTS.length)], 1, "Easy", rng.nextBoolean());
    }

    public static Question fakeEssay(){
        return new EssayQuestion(ESSAY_TEXTS[rng.nextInt(ESSAY_TEXTS.length)], 10, "Hard", 150);
    }

    public static Question fakeProgramming() {
        return new ProgrammingQuestion(PROG_TEXTS[rng.nextInt(PROG_TEXTS.length)], 20, "Hard", "Java");
    }
}
