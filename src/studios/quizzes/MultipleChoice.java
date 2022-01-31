package studios.quizzes;

import java.util.ArrayList;

public class MultipleChoice extends Question{
    private String answer;

    public MultipleChoice(String question, ArrayList<String> options, String answer) {
        super(question, options);
        this.answer = answer;
    }


    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public void displayAnswers() {

    }

    @Override
    public int getAnswers() {
        return 0;
    }
}
