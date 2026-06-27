package exam;

import core.Exam;

public class FinalExam implements Exam {
    @Override
    public String getType() { return "Final Exam"; }

    @Override
    public void displayInfo() {
        System.out.println("Type: " + getType());
    }
}
