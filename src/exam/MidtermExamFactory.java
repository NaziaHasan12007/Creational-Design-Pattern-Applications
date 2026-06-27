package exam;

import core.*;

public class MidtermExamFactory extends ExamFactory {
    @Override
    public Exam createExam() { return new MidTermExam(); }
}
