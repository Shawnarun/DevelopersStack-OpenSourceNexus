// Author - Kavitharan
// Email - kavithranofficial@gmail.com
// Date - 17/02/2024
// Description -  Add Two Numbers

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
            
            int num1,num2,results;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the first number");
            num1 = input.nextInt();
            System.out.println("Enter the second number");
            num2 = input.nextInt();
            input.close();

            results = num1 + num2;

            System.out.printf("%d + %d = %d", num1,num2,results );
    }
    
}