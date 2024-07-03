/*
* Author :Thayuran
* Email : thayuran1998@gmail.com
* Date : 18 feb 2024
* Description :  generates two random numbers and asks the user to calculate the sum
*/


import java.util.Scanner;
import java.util.Random;

public class SumofTwoInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Calculation Challenge!");

        int score = 0;
        int totalAttempts = 3;

        for (int attempt = 1; attempt <= totalAttempts; attempt++) {
            int number1 = random.nextInt(100);
            int number2 = random.nextInt(100);
            int correctAnswer = number1 + number2;

            System.out.println("\nQuestion " + attempt + ":");
            System.out.println("What is the sum of " + number1 + " and " + number2 + "?");

            int userAnswer;
            try {
                userAnswer = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
                attempt--; 
                continue;
            }

            if (userAnswer == correctAnswer) {
                score++;
                System.out.println("Correct! Your current score is: " + score);
            } else {
                System.out.println("Incorrect! The correct answer is: " + correctAnswer);
            }
        }

        System.out.println("\nGame Over! Your final score is: " + score);
        scanner.close();
    }
}
