package source;
import questions.mcq.*;
import questions.true_false.*;
import questions.essay.*;
import questions.programming.*;
import core.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuestionBank {
    private static final List<Question> bank = new ArrayList<>();

    static {
        bank.add(new MCQQuestion(
                "Which of the following is NOT an OOP principle?",
                2, "Medium",
                new String[]{"Encapsulation", "Polymorphism", "Compilation", "Abstraction"}, 2
        ));
        bank.add(new MCQQuestion(
                "What does the 'S' in SOLID stand for?",
                2, "Easy",
                new String[]{"Single Responsibility", "Simple Design", "Static Binding", "Structured Code"}, 0
        ));
        bank.add(new MCQQuestion(
                "Which pattern defines a skeleton of an algorithm?",
                2, "Medium",
                new String[]{"Factory", "Observer", "Template Method", "Decorator"}, 2
        ));

        bank.add(new TrueFalseQuestion(
                "Java supports multiple inheritance through interfaces.", 1, "Easy", true
        ));
        bank.add(new TrueFalseQuestion(
                "Abstract classes can be instantiated directly.", 1, "Easy", false
        ));
        bank.add(new EssayQuestion(
                "Explain the role of design patterns in software engineering.", 10, "Hard", 150
        ));
        bank.add(new EssayQuestion(
                "Compare and contrast Factory Method and Abstract Factory patterns.", 10, "Hard", 200
        ));

        bank.add(new ProgrammingQuestion(
                "Implement a generic Stack class in Java with push, pop, and peek methods.",
                20, "Hard", "Java"
        ));
        bank.add(new ProgrammingQuestion(
                "Write a recursive method to compute the nth Fibonacci number.",
                20, "Hard", "Java"
        ));
    }
        public static List<Question> getAll (){
            return bank;
        }
        public static Question getRandom (){
            return bank.get(new Random().nextInt(bank.size()));
        }
        public static Question getByType (String type){
            List<Question> filtered=new ArrayList<>();
            for(Question q:bank){
                if(q.getType().equals(type)){
                    filtered.add(q);
                }
            }
            if(filtered.isEmpty()){
                return getRandom();
            }
            return filtered.get(new Random().nextInt(filtered.size()));
        }
}
