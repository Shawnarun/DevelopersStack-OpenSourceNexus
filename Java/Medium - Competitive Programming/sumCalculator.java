/*
* Author : thushaonline
* Gmail : rajthusha99@gmail.com
* Date : 06.03.2024
* Description :  SumToNumbers
*/

/*
 * Author : musaraf
 * email : nowsathmusaraf037@gmial.com
 * Date : 25/06/2024
 * Description : Error Correction
 */

import java.util.Scanner;

public class sumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();
        
        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();
        
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        
        scanner.close();
    }
}
