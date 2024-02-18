/*
 * Author : KPriyandhini
 * Email : priyandhinip@gmail.com
 * Date : 17th of Feb 2024
 * Description : This code represents a simple banking system with a Bank class managing a list of Account objects. 
 *               The BankingSystem class provides a basic console-based interface for users to display accounts, deposit, and withdraw funds. 
 *               The code demonstrates the use of classes, methods, loops, and user input handling in Java.
 */

 import java.util.ArrayList;
 import java.util.Scanner;
 
 class Bank {
     private ArrayList<Account> accounts;
 
     public Bank() {
         this.accounts = new ArrayList<>();
     }
 
     public void addAccount(Account account) {
         this.accounts.add(account);
     }
 
     public void displayAccounts() {
         for (Account account : accounts) {
             System.out.println(account);
         }
     }
 
     public Account findAccount(int accountNumber) {
         for (Account account : accounts) {
             if (account.getAccountNumber() == accountNumber) {
                 return account;
             }
         }
         return null;
     }
 }
 
 class Account {
     private static int nextAccountNumber = 1001;
     private int accountNumber;
     private String accountHolder;
     private double balance;
 
     public Account(String accountHolder, double initialBalance) {
         this.accountNumber = nextAccountNumber++;
         this.accountHolder = accountHolder;
         this.balance = initialBalance;
     }
 
     public int getAccountNumber() {
         return accountNumber;
     }
 
     public double getBalance() {
         return balance;
     }
 
     public void deposit(double amount) {
         balance += amount;
         System.out.println("Deposited: $" + amount);
     }
 
     public void withdraw(double amount) {
         if (amount <= balance) {
             balance -= amount;
             System.out.println("Withdrawn: $" + amount);
         } else {
             System.out.println("Insufficient funds.");
         }
     }
 
     @Override
     public String toString() {
         return "Account Number: " + accountNumber +
                 ", Account Holder: " + accountHolder +
                 ", Balance: $" + balance;
     }
 }
 
 public class BankingSystem {
     public static void main(String[] args) {
         Bank bank = new Bank();
 
         Account account1 = new Account("John Doe", 1000);
         Account account2 = new Account("Jane Doe", 1500);
 
         bank.addAccount(account1);
         bank.addAccount(account2);
 
         Scanner scanner = new Scanner(System.in);
 
         int choice;
         do {
             System.out.println("\n1. Display Accounts");
             System.out.println("2. Deposit");
             System.out.println("3. Withdraw");
             System.out.println("0. Exit");
             System.out.print("Enter your choice: ");
             choice = scanner.nextInt();
 
             switch (choice) {
                 case 1:
                     bank.displayAccounts();
                     break;
                 case 2:
                     System.out.print("Enter Account Number: ");
                     int depositAccountNumber = scanner.nextInt();
                     Account depositAccount = bank.findAccount(depositAccountNumber);
                     if (depositAccount != null) {
                         System.out.print("Enter Deposit Amount: $");
                         double depositAmount = scanner.nextDouble();
                         depositAccount.deposit(depositAmount);
                     } else {
                         System.out.println("Account not found.");
                     }
                     break;
                 case 3:
                     System.out.print("Enter Account Number: ");
                     int withdrawAccountNumber = scanner.nextInt();
                     Account withdrawAccount = bank.findAccount(withdrawAccountNumber);
                     if (withdrawAccount != null) {
                         System.out.print("Enter Withdrawal Amount: $");
                         double withdrawAmount = scanner.nextDouble();
                         withdrawAccount.withdraw(withdrawAmount);
                     } else {
                         System.out.println("Account not found.");
                     }
                     break;
                 case 0:
                     System.out.println("Exiting...");
                     break;
                 default:
                     System.out.println("Invalid choice. Please try again.");
             }
 
         } while (choice != 0);
 
         scanner.close();
     }
 }
 







