/*
 * Author : musaraf
 * Email : nowsathmusaraf037@gmail.com
 * Date : 23/06/2024
 * Description : Simple calculator
 */
import java.util.Scanner;
public class calculator {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        double num1 = sc.nextDouble();
        System.out.print("Enter Sceond Number : ");
        double num2 = sc.nextDouble();

        System.out.println("Enter A Operator");
        System.out.println("+");
        System.out.println("-");
        System.out.println("*");
        System.out.println("/");
        char op = sc.next().charAt(0);
        double result = 0;

        switch (op) {
            case '+':
                result = num1+num2;
                System.out.println(result);
                break;
            case '-':
                result = num1-num2;
                System.out.println(result);
                break;
            case '*':
                result = num1*num2;
                System.out.println(result);
                break;
            case '/':
                result = num1/num2;
                System.out.println(result);
                break;
        
            default:
                System.out.println("Invalid Operator");
        }
        sc.close();
    }
    
}
