/*
 * Author : Keerthika04
 * Email : jkeerthi144@gmail.com
 * Date : 15th of Feb 2024
 * Description : Given two strings of lowercase English letters,  and , perform the following operations:
 *                  Sum the lengths of  and .
 *                  Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
 *                  Capitalize the first letter in  and  and print them on a single line, separated by a space.
 */

 /*
 * Author : musaraf
 * Email : nowsathmusaraf037@gmail.com
 * Date : 25/06/2024
 * Description : Warning Message removed
 */

import java.util.*;

public class HackerRank_String_Introduction_Question {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first word: ");
        String A=sc.next();
        System.out.print("Enter the second word: ");
        String B=sc.next();
        String total =(A+B);
        System.out.println("Total Letter Count: " + total.length());
        if(A.compareTo(B)>0)
            System.out.println("Yes, first word is more than second");
        else
            System.out.println("No, second word is more than first");
         
        String Out = A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(Out);
        
        sc.close();
    }
}



