/*
Author: Shanth05
Email: shanth.pirashanth5@gmail.com
Date: 22/02/2024
Description:  Find Factorial of a Number
 */

 public class Factorial {

    public static void main(String[] args) {

        int num = 10;
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}