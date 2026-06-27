package exam;

import core.Exam;
import core.ExamFactory;

public class FinalExamFactory extends ExamFactory {
    @Override
    public Exam createExam() { return new FinalExam(); }
}
