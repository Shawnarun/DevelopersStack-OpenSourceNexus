/*
* Author :Thayuran
* Email : thayuran1998@gmail.com
* Date : 21 feb 2024
* Description : Stone-Paper-Scissors game based on Java console application
*/

import java.util.Random;
import java.util.Scanner;

public class RPSGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        
        System.out.println("\nWelcome to the Stone-Paper-Scissors game!");
        System.out.println("\nRules of Game:\nPress: 1 -> Stone\t2 -> Paper\t3 -> Scissors\t0 -> Exit");

        
        while (true) {
            System.out.println("\nChoose between gaming modes: \n1. User vs Computer \n2. User vs User\n");
            System.out.print("Enter your choice: ");
            int gamingMode = sc.nextInt();

            if (gamingMode == 1) {
                playUserVsComputer(sc, r);
            } else if (gamingMode == 2) {
                playUserVsUser(sc);
            } else {
				 clearScreen();
                System.out.println("Invalid selection of gaming mode! Try again...");
				
                continue;
            }

            
            System.out.println("\nDo you want to play again? [yes / no]: ");
            if (!sc.next().equalsIgnoreCase("yes")) {
                break;
            }
        }
        sc.close();
    }

    
    private static void playUserVsComputer(Scanner sc, Random r) {
		clearScreen();
        System.out.println("\n---- User vs Computer mode ----");
		System.out.println("\nRules of Game:\nPress: 1 -> Stone\t2 -> Paper\t3 -> Scissors\t0 -> Exit");	
        while (true) {
            System.out.print("\nEnter your choice: ");
            int userChoice = sc.nextInt();

            if (userChoice == 0) {
                System.out.println("Thank you for playing the game. Goodbye!");
                break;
            }

            if (userChoice < 1 || userChoice > 3) {
                System.out.println("Invalid Input! Try again and select your choice.");
                continue;
            }

            int computerChoice = r.nextInt(3) + 1;

            System.out.println("Your choice: " + getChoice(userChoice));
            System.out.println("Computer's choice: " + getChoice(computerChoice));

            int result = getWinner(userChoice, computerChoice);
            printResult(result, "User", "Computer");
        }
    }

   
    private static void playUserVsUser(Scanner sc) {
		clearScreen();
        System.out.println("\n---- User vs User mode -----");
		System.out.println("\nRules of Game:\nPress: 1 -> Stone\t2 -> Paper\t3 -> Scissors\t0 -> Exit");
        int user1Choice, user2Choice;

        while (true) {
            System.out.print("\nEnter your choice, User 1: ");
            user1Choice = sc.nextInt();

            if (user1Choice == 0) {
                System.out.println("Thank you for playing the game. Goodbye!");
                break;
            }

            if (user1Choice < 1 || user1Choice > 3) {
                System.out.println("Invalid Input! Try again, User 1.");
                continue;
            }

            System.out.print("\nEnter your choice, User 2: ");
            user2Choice = sc.nextInt();

            if (user2Choice == 0) {
                System.out.println("Thank you for playing the game. Goodbye!");
                break;
            }

            if (user2Choice < 1 || user2Choice > 3) {
                System.out.println("Invalid Input! Try again, User 2.");
                continue;
            }

            System.out.println("User 1's choice: " + getChoice(user1Choice));
            System.out.println("User 2's choice: " + getChoice(user2Choice));

            int result = getWinner(user1Choice, user2Choice);
            printResult(result, "User 1", "User 2");
        }
    }

    private static String getChoice(int choice) {
        switch (choice) {
            case 1:
                return "Stone";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "Invalid choice!";
        }
    }

   
    private static int getWinner(int choice1, int choice2) {
        if (choice1 == choice2) {
            return 0;
        } else if ((choice1 == 1 && choice2 == 3) || (choice1 == 2 && choice2 == 1)
                || (choice1 == 3 && choice2 == 2)) {
            return 1; 
        } else {
            return -1; 
        }
    }

    
    private static void printResult(int result, String string, String string2) {
		
        if (result == 0) {
            System.out.println("It's a tie!");
        } else if (result == 1) {
            System.out.println("Congratulations! " + string + " win the game!");
        } else {
            System.out.println("Congratulations! " + string2 + " win the game!");
        }
    }

 public static void clearScreen() {
           
        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (final Exception e) {
           
            System.out.println("Failed to clear console: " + e.getMessage());
        }
    
    }

}