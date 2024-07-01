/*
 * Author : Keerthika04
 * Email : jkeerthi144@gmail.com
 * Date : 14th of Feb 2024
 * Description : A palindrome is a word which reads the same backward or forward.
 *          eg : madam
 */

/*
 * Author : musaraf
 * Email : nowsathmusaraf037@gmail.com
 * Date : 25/06/2024
 * Description : Warning message removed
 */

import java.util.*;

public class String_Reverse {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your word: ");
    String A = sc.next();
    String str = new StringBuilder(A).reverse().toString();

    if (A.equals(str)) 
      System.out.println("Yes, it\'s palindrome word.");
    else 
      System.out.println("No, it\'s not a palindrome word.");

      sc.close();
  }
}
