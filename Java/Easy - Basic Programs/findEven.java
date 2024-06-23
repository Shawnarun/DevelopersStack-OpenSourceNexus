/*
 * Author : Musaraf
 * Email : nowsathmusaraf037@gmail.com
 * Date : 23/06/2024
 * Description : Find User Given Number Even or Odd
 */
import java.util.Scanner;
public class findEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("The number is even");
            } else {
                System.out.println("The number is odd");
                }
        sc.close();
}
}
