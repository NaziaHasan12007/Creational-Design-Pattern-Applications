package source;

import core.Question;

public class FakerQuestionSource implements QuestionSource{
    private String questionType;
    public FakerQuestionSource(String questionType) {

        this.questionType=questionType;
    }
    @Override
    public Question getQuestion(){
        switch (questionType) {
            case "MCQ": return QuestionFaker.fakeMCQ();
            case "True/False": return QuestionFaker.fakeTrueFalse();
            case "Essay": return QuestionFaker.fakeEssay();
            case "Programming": return QuestionFaker.fakeProgramming();
            default:return QuestionFaker.fakeMCQ();
        }
    }
}
