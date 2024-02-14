/*
 * Author : Keerthika04
 * Email : jkeerthi144@gmail.com
 * Date : 14th of Feb 2024
 * Description : Kite Star Pattern
 */

public class Kite_Star_Pattern {

  public static void main(String[] args) {
    int rows = 3;

    for (int i = 1; i <= rows; i++) {
      for (int j = rows - 1 ; j >= i; j--) {
        System.out.print(" ");
      }
      for (int k = 1; k <= i; k++) {
        System.out.print(" *");
      }
      System.out.println();
    }

    for (int i = 1; i <= rows; i++) {
      for (int k = 1; k <= i; k++) {
        System.out.print(" ");
      }
      for (int j = rows - 1 ; j >= i; j--) {
        System.out.print(" *");
      }
      System.out.println();
    }
  }
  }
  
