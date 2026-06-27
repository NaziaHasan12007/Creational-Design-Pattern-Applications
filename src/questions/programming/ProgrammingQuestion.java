package questions.programming;

import core.Question;

public class ProgrammingQuestion implements Question {
    private String text;
    private int points;
    private String difficulty;
    private String language;

    public ProgrammingQuestion(String text, int points, String difficulty, String language) {
        this.text = text;
        this.points = points;
        this.difficulty = difficulty;
        this.language = language;
    }

    @Override public String getType()       { return "Programming"; }
    @Override public int    getPoints()     { return points; }
    @Override public String getDifficulty() { return difficulty; }
    @Override public String getText()       { return text; }

    public String getLanguage() { return language; }
}
