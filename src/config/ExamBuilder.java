package config;

public class ExamBuilder {
    private final ExamConfiguration config=ExamConfiguration.empty();

    public ExamBuilder title(String title){
        config.title=title;
        return this;
    }
    public ExamBuilder duration(int minutes){
        config.duration=minutes;
        return this;
    }
    public ExamBuilder passingScore(int score){
        config.passingScore=score;
        return this;
    }
    public ExamBuilder negativeMarking(boolean enabled){
        config.negativeMarking=enabled;
        return this;
    }
    public ExamBuilder questionShuffle(boolean enabled){
        config.questionShuffle=enabled;
        return this;
    }
    public ExamBuilder autoSubmit(boolean enabled){
        config.autoSubmit=enabled;
        return this;
    }
    public ExamBuilder calculatorAllowed(boolean enabled){
        config.calculatorAllowed=enabled;
        return this;
    }
    public ExamConfiguration build(){
        if(config.title==null||config.title.isEmpty()){
            throw new IllegalStateException("Exam title must not be empty.");
        }
        if(config.duration<=0){
            throw new IllegalStateException("Duration must be positive.");
        }
        return config;
    }
}
