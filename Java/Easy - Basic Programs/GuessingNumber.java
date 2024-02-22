/*
* Author :Thayuran
* Email : thayuran1998@gmail.com
* Date : 22 feb 2024
* Description : Random Number Guessing Game
*/

import java.util.Random;
import java.util.Scanner;

public class GuessingNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int r;
        int i;
        int sr;

        System.out.println("GUESS THE NUMBER.Enter the number of tries:");
        r = sc.nextInt();
        System.out.println("Enter the lower bound of number ");
        int lower = sc.nextInt();
        System.out.println("Enter the upper bound of number ");
        int upper = sc.nextInt();
        sr = lower + rd.nextInt(upper) + 1;
        System.out.println("Let's go!");

        for(i = 0; i < r; i++) {

            System.out.println("Enter the number: ");
            int ir = sc.nextInt();

            if (ir == sr) {
                System.out.println("You guessed right!");
                break;
            } else if (ir < sr){
                System.out.println("You're wrong. Hint: chose a greater number.");
            } else {
                System.out.println("You're wrong. Hint: chose a smaller number. ");
            }
            if (i == r - 1) {
                System.out.println("You're out of tries... The number was " + sr);
            }
        }


    }

}