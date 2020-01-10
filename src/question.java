import java.util.ArrayList;


public class question {
    private String ques;
    private int trueAnswer;
    private ArrayList<String> listAnswers;


    question(String questions, ArrayList<String> answers, int trueAns)
    {
        ques = questions;

        listAnswers = new ArrayList<String>();
        listAnswers = answers;

        trueAnswer = trueAns;
    }

    String getQues()
    {
        return ques;
    }

    String getAnswer(int index)
    {
        return listAnswers.get(index);
    }

    int getAnswerIsTrue()
    {
        return trueAnswer;
    }


}
