package studios.quizzes;

import java.util.ArrayList;

public class Checkbox extends Question{
    private ArrayList<String> answer;

    public Checkbox(String question, ArrayList<String> options, ArrayList<String> answer) {
        super(question, options);
        this.answer = answer;
    }

    public ArrayList<String> getAnswer() {
        return answer;
    }

    public void setAnswer(ArrayList<String> answer) {
        this.answer = answer;
    }
}
