/*
 *
 * Author : Aysha-Thikra
 * Email : ayshathelegendary@gmail.com
 * Date : 17/02/2024
 * Description : Tip Calculator
 * 
 */

 
import java.util.Scanner;

public class Tip_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
        	System.out.println("====================================");
            System.out.println("===  Welcome to Tip Calculator!  ===");
            System.out.println("====================================");
            System.out.println("===	1. Tip Calculator");
            System.out.println("===	2. Split Bill");
            System.out.println("===	3. Exit");
            System.out.println("                                    ");
            System.out.print("Enter your choice :");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    tipCalculator(scanner);
                    break;
                case 2:
                    splitBill(scanner);
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }

        scanner.close();
        System.out.println("Exiting the program. Thank you for using the Tip Calculator!");
    }

    private static void tipCalculator(Scanner scanner) {
        System.out.print("Enter the total bill amount: Rs.");
        double billAmount = scanner.nextDouble();

        System.out.print("Enter the tip percentage (example: 15 for 15%): ");
        double tipPercentage = scanner.nextDouble();

        double tipAmount = (billAmount * tipPercentage) / 100;
        double totalAmount = billAmount + tipAmount;

        System.out.println("===  Tip amount: Rs." + tipAmount);
        System.out.println("===  Total amount (including tip): Rs." + totalAmount);
    }

    private static void splitBill(Scanner scanner) {
        System.out.print("Enter the total bill amount: Rs.");
        double billAmount = scanner.nextDouble();

        System.out.print("Enter the number of people to split the bill: ");
        int numberOfPeople = scanner.nextInt();

        double amountPerPerson = billAmount / numberOfPeople;

        System.out.println("===  Total amount: Rs." + billAmount);
        System.out.println("===  Number of people: " + numberOfPeople);
        System.out.println("===  Amount per person: Rs." + amountPerPerson);
    }
}
