/**
Author: Musaraf
Email: nowsathmusaraf037@gmail.com
Date: 21/06/2024
Description: Multiple Two Number 
 */

 import java.util.Scanner;
public class MulTwoNumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter First Number");
        int Number_1 = sc.nextInt();

        System.out.println("Enter Second Number");
        int Number_2 = sc.nextInt();

        int result = Number_1 * Number_2;
        System.out.println("The multiplication of two numbers is: " + result);

        sc.close();
    }
}
