import java.util.Scanner;

/**
Author: AyshaCader
Email: ayshacader20001@gmail.com
Date: 18/02/2024
Description: getting the values and display the addition, subtraction, multiplication, division, remainder, largest value and the smallest value of the two integers.
 */

 import java.util.*;

public class arithmatic {


    public static void main(String[] args) {

        int a,b;
        Scanner number = new Scanner(System.in);

        System.out.print("Enter the first number\n");
        a = number.nextInt();

        System.out.print("Enter the second number\n");
        b = number.nextInt();

        System.out.println("The a+b is:"+(a+b));
        System.out.println("The a-b is:"+(a-b));
        System.out.println("The a*b is:"+(a*b));
        System.out.println("The a/b is:"+(a/b));
        System.out.println("The a%b is:"+(a%b));
        System.out.println("The Largest number is:"+((a>b)?a:b));
        System.out.println("The Smallest number is:"+((a<b)?a:b));
    }
    
}
