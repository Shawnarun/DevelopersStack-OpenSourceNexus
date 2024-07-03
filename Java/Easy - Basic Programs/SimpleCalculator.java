/*
 * Author : KPriyandhini
 * Email : priyandhinip@gmail.com
 * Date : 15th of Feb 2024
 * Description : A Simple calculaer program.
 */
    

public class SimpleCalculator {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        // Instructions
        System.out.println("Simple Calculator Program");
        System.out.println("Enter two numbers and choose an operation:");
        
        // Get user input
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Choose operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);
        
        // Perform calculation
        double result = 0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operation.");
                return;
        }
        
        // Display result
        System.out.println("Result: " + result);
        
        // Close the scanner
        scanner.close();
    }
}
