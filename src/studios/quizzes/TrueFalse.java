package studios.quizzes;

import java.util.ArrayList;

public class TrueFalse extends Question{
    private boolean answer;


    public TrueFalse(String question, ArrayList<String> options, boolean answer) {
        super(question, options);
        this.answer = answer;
    }

    public boolean isAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }
}
