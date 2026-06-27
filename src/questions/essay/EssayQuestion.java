package questions.essay;

import core.Question;

public class EssayQuestion implements Question {
    private String text;
    private int points;
    private String difficulty;
    private int minWords;

    public EssayQuestion(String text, int points, String difficulty, int minWords) {
        this.text = text;
        this.points = points;
        this.difficulty = difficulty;
        this.minWords = minWords;
    }

    @Override public String getType()       { return "Essay"; }
    @Override public int    getPoints()     { return points; }
    @Override public String getDifficulty() { return difficulty; }
    @Override public String getText()       { return text; }

    public int getMinWords() { return minWords; }
}
