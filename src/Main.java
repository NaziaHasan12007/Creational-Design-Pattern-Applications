import java.util.ArrayList;
import java.util.List;
import core.*;
import questions.mcq.*;
import questions.true_false.*;
import questions.essay.*;
import questions.programming.*;
import config.*;
import exam.*;
import source.*;

public class Main {

    public static void main(String[] args) {

        // ------------------------------------------------------------------
        // STEP 1: Instantiate a targeted ExamFactory to pick the exam format
        // ------------------------------------------------------------------
        ExamFactory examFactory = new MidtermExamFactory();
        Exam exam = examFactory.createExam();

        // ------------------------------------------------------------------
        // STEP 2: Declare active QuestionSource strategy (Bank Mode)
        // ------------------------------------------------------------------
        // Switch to FakerQuestionSource(...) here to test Auto/Faker mode.
        String sourcingStrategyLabel = "Question Bank Mode";

        QuestionSource mcqSource   = new BankQuestionSource("MCQ");
        QuestionSource tfSource    = new BankQuestionSource("True/False");
        QuestionSource essaySource = new BankQuestionSource("Essay");
        QuestionSource progSource  = new BankQuestionSource("Programming");

        // ------------------------------------------------------------------
        // STEP 3: Initialize Abstract Factories with the source strategy
        // ------------------------------------------------------------------
        QuestionFactory mcqFactory   = new MCQFactory(mcqSource);
        QuestionFactory tfFactory    = new TrueFalseFactory(tfSource);
        QuestionFactory essayFactory = new EssayFactory(essaySource);
        QuestionFactory progFactory  = new ProgrammingFactory(progSource);

        // ------------------------------------------------------------------
        // STEP 4: Chain ExamBuilder to construct runtime configuration
        // ------------------------------------------------------------------
        ExamConfiguration config = new ExamBuilder()
                .title("OOP Midterm Exam")
                .duration(60)
                .passingScore(50)
                .negativeMarking(true)
                .questionShuffle(true)
                .calculatorAllowed(false)
                .autoSubmit(true)
                .build();

        // ------------------------------------------------------------------
        // STEP 5: Generate questions from each factory
        // ------------------------------------------------------------------
        List<Question> questions = new ArrayList<>();
        questions.add(mcqFactory.createQuestion());    // MCQ 1
        questions.add(mcqFactory.createQuestion());    // MCQ 2
        questions.add(essayFactory.createQuestion());  // Essay
        questions.add(progFactory.createQuestion());   // Programming
        questions.add(tfFactory.createQuestion());     // True/False

        // ------------------------------------------------------------------
        // STEP 6: Print the unified dashboard summary
        // ------------------------------------------------------------------
        printDashboard(exam, config, sourcingStrategyLabel, questions);
    }

    // -----------------------------------------------------------------------
    // Dashboard Printer
    // -----------------------------------------------------------------------
    private static void printDashboard(Exam exam,
                                       ExamConfiguration cfg,
                                       String sourcingLabel,
                                       List<Question> questions) {

        String bar = "=====================================================================";

        System.out.println(bar);
        System.out.println("EXAM CREATED SUCCESSFULLY");
        System.out.println(bar);

        System.out.println("Type: "           + exam.getType());
        System.out.println("Title: "          + cfg.getTitle());
        System.out.println("Duration: "       + cfg.getDuration()     + " minutes");
        System.out.println("Passing Score: "  + cfg.getPassingScore() + " Marks");

        System.out.println();
        System.out.println("Configuration Profiles:");
        System.out.println((cfg.isNegativeMarking()   ? "✓" : "✗") + " Negative Marking Enabled");
        System.out.println((cfg.isQuestionShuffle()   ? "✓" : "✗") + " Question Shuffle Activated");
        System.out.println((cfg.isCalculatorAllowed() ? "✓" : "✗") + " Embedded Calculator Allowed");
        System.out.println((cfg.isAutoSubmit()        ? "✓" : "✗") + " Auto-Submit On Timeout");

        System.out.println();
        System.out.println("Question Sourcing Strategy: " + sourcingLabel);

        System.out.println();
        System.out.println("Compiled Structural Components:");
        for (Question q : questions) {
            System.out.printf("  - [Type: %-12s] Points: %-3d Difficulty: %s%n",
                    q.getType(), q.getPoints(), q.getDifficulty());
        }

        System.out.println(bar);
    }
}
