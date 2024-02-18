// Author - Kavitharan
// Email - kavithranofficial@gmail.com
// Date - 16/02/2024
// Description -  Even Number Odd Number

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
            
            int number,remainder;
            System.out.println("Pls Enter an Integer Number");
            Scanner scan = new Scanner(System.in);
            number = scan.nextInt();
            scan.close();
            
            remainder = number % 2;
            
            if( remainder == 0 )
                System.out.println(number+" is an Even Number");
            else
                System.out.println(number+" is an Odd Number");
            
        } 
    
}