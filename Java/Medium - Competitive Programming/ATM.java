/*
* Author :Thayuran
* Email : thayuran1998@gmail.com
* Date : 24 feb 2024
* Description : Simple ATM Cash withdraw
*/

import java.util.Scanner;

public class ATM {
    private static double balance = 1000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        System.out.println("Welcome to the ATM!");

        while (!exit) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting ATM. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }

        scanner.close();
    }

    public static void checkBalance() {
        System.out.println("Your current balance is: $" + balance);
    }

    public static void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Your new balance is: $" + balance);
        } else {
            System.out.println("Invalid amount for deposit!");
        }
    }

    public static void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawal successful. Your new balance is: $" + balance);
            } else {
                System.out.println("Insufficient funds!");
            }
        } else {
            System.out.println("Invalid amount for withdrawal!");
        }
    }
}
