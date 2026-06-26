package source;
import core.Question;
public class BankQuestionSource implements QuestionSource{
    private String questionType;
    public BankQuestionSource(String questionType){
        this.questionType=questionType;
    }
    public BankQuestionSource(){
        this.questionType=null;
    }
    @Override
    public Question getQuestion(){
        if(questionType!=null){
            return QuestionBank.getByType(questionType);
        }
        return QuestionBank.getRandom();
    }
}
