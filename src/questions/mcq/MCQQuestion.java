package questions.mcq;
import core.Question;

public class MCQQuestion implements Question {
    private String text;
    private int points;
    private String difficulty;
    private String[] options;
    private int correctIndex;

    public MCQQuestion(String text, int points, String difficulty, String[] options, int correctIndex){
        this.text=text;
        this.points=points;
        this.difficulty=difficulty;
        this.options=options;
        this.correctIndex=correctIndex;
    }

    @Override public String getType(){
        return "MCQ";
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
    public String[] getOptions(){
        return options;
    }
    public int getCorrectIndex(){
        return correctIndex;
    }
}
