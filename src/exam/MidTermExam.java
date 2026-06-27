package exam;

import core.Exam;

public class MidTermExam implements Exam {
    @Override
    public String getType() { return "Midterm Exam"; }

    @Override
    public void displayInfo() {
        System.out.println("Type: " + getType());
    }
}
