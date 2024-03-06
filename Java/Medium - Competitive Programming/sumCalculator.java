/*
* Author : thushaonline
* Gmail : rajthusha99@gmail.com
* Date : 06.03.2024
* Description :  SumToNumbers
*/

import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();
        
        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();
        
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        
        scanner.close();
    }
}
