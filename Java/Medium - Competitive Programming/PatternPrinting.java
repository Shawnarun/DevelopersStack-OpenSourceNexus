/*
* Author : thushaonline
* Gmail : rajthusha99@gmail.com
* Date : 22.02.2024
* Description :  Pattern Printing
*/

public class PatternPrinting {
    public static void main(String[] args) {
        int rows = 5;
        
        // Pattern 1
        System.out.println("Pattern 1:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // Pattern 2
        System.out.println("\nPattern 2:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // Pattern 3
        System.out.println("\nPattern 3:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
