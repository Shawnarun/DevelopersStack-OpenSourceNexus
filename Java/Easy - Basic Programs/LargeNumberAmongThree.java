/*
 * Author : musaraf
 * Email : nowsathmusaraf037@gmail.com
 * Date : 24/06/2024
 * Description : Find Large Number Among three number
 */

 import java.util.Scanner;
 public class LargeNumberAmongThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter second Number : ");
        int num2 = sc.nextInt();

        System.out.println("Enter Third Number : ");
        int num3 = sc.nextInt();

        if(num1>num2 && num1 >num3){
            System.out.println("Number "+num1+ " is Largest Number");
        }
        else if(num2>num1 && num2 > num3){
            System.out.println("Number "+num2+" is Largest Number");
        }
        else{
            System.out.println("Number "+num3+" is Largest Number");
        }

        sc.close();
    }

}