import java.util.ArrayList;
import java.util.Collections;

public class Question {

    private String question;
    private ArrayList<String> choices;
    private String answer;

 public Question(String question, String[] choices, String answer) 
 {
    this.question = question;
    this.choices = new ArrayList<String>();
            for (int i = 0; i < choices.length; i++)
            {
                this.choices.add(choices[i]);
            }
    

  Collections.shuffle(this.choices);
  this.answer = answer;
 }

 public String getQuestion()
  {
        return question;
  }
 public ArrayList<String> getChoices() 
    {
        return choices;
    }
 public String getAnswer() 
    {
        return answer;
    }

}