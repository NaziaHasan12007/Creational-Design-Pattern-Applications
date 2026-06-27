package exam;

import core.*;

public class PracticeQuizFactory extends ExamFactory {
    @Override
    public Exam createExam() { return new PracticeQuiz(); }
}
