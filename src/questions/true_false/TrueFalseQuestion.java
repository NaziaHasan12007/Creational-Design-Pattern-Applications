package questions.true_false;
import core.Question;

public class TrueFalseQuestion implements Question {
    private String text;
    private int points;
    private String difficulty;
    private boolean correctAnswer;

    public TrueFalseQuestion(String text, int points, String difficulty, boolean correctAnswer){
        this.text=text;
        this.points=points;
        this.difficulty=difficulty;
        this.correctAnswer=correctAnswer;
    }

    @Override public String getType(){
        return "True/False";
    }
    @Override public int getPoints(){
        return points;
    }
    @Override public String getDifficulty(){
        return difficulty;
    }
    @Override public String getText(){
        return text;
    }
    public boolean getCorrectAnswer(){
        return correctAnswer;
    }
}
