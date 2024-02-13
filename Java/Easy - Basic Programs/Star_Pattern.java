/*
* Author : Keerthika04
* Email : jkeerthi144@gmail.com
* Date : 14th of Feb 2024
* Description : Right Angle Triangle Star Pattern
*/

public class Star_Pattern {

  public static void main(String[] args) {
    int rows = 5;

    for (int i = 0; i <= rows; i++) {
      for (int j = 0; j <= i; j++) { 
        System.out.print(" * ");
      }

      System.out.println();
    }
  }
}
