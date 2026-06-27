package exam;

import core.Exam;

public class PracticeQuiz implements Exam {
    @Override
    public String getType() { return "Practice Quiz"; }

    @Override
    public void displayInfo() {
        System.out.println("Type: " + getType());
    }
}
