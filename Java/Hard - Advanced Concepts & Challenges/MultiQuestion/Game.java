import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Game {
  
 private ArrayList<Question> questionSet;

 public Game() 
 {
    questionSet = new ArrayList<Question>();

    String q = "What does JDBC stand for? " ;
    String[] a = {"Java Database Connectivity", "Java Data Binding Connection", "Java Database Control", "Java Data Business Connector"};
    questionSet.add(new Question(q, a, " Java Database Connectivity"));

    q = "Which keyword is used to create a new instance of a class?";
    a = new String[]{"new", "this", "instance","object"};
    questionSet.add(new Question(q, a, "new"));

    q = "If a method does not access instance variables, it can be declared as...?";
    a = new String[]{"static", "private", "void", "public"};
    questionSet.add(new Question(q, a, "static"));

    q = "Which interface provides methods to insert, remove, and inspect elements?";
    a = new String[]{"List", "Set", "Queue", "Map"};
    questionSet.add(new Question(q, a, "Queue"));

    q = "Which HTTP method is used to retrieve data from a server using a servlet?";
    a = new String[]{"GET", "POST", "PUT", "DELETE"};
    questionSet.add(new Question(q, a, "GET"));


    Collections.shuffle(questionSet, new Random());
 }


 public void start() 
 {
  Scanner scan = new Scanner(System.in);
  int numCorrect = 0;
  
  for (int question = 0; question < questionSet.size(); question++) 
  {

   System.out.println(questionSet.get(question).getQuestion());
   int numChoices = questionSet.get(question).getChoices().size();
  
      for (int choice = 0; choice < numChoices; choice++) 
      {
        System.out.println((choice + 1) + ": " + 
          questionSet.get(question).getChoices().get(choice));
      }

      int playerAnswer = scan.nextInt();
      ArrayList<String> choiceSet =questionSet.get(question).getChoices();
      String correctAnswer = questionSet.get(question).getAnswer();
      int correctAnswerIndex = choiceSet.indexOf(correctAnswer);

      if (playerAnswer == correctAnswerIndex + 1)
        {
          numCorrect++;
        }
  }
  scan.close();
  System.out.println("You got " + numCorrect + " correct answer(s)");
 }
}