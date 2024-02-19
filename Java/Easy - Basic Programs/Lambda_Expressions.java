/*
 * Author : Keerthika04
 * Email : jkeerthi144@gmail.com
 * Date : 19th of Feb 2024
 * Description : Difference between normal and lambda expressions
 */

public class Lambda_Expressions {

  public static void main(String[] args) {
    //Normal way
    Task t1 = new Task() {
      @Override
      public void writing() {
        System.out.println("Journal");
      }
    };

    //Lambda Expression
    Task t2 = () -> System.out.println("Documentation");

    t1.writing();
    t2.writing();
  }
}

interface Task {
  void writing();
}
