/*
 * Author : Musaraf
 * Email : nowsathmusaraf037@gmail.com
 * Date : 21/06/2024
 * Descriptoin : Number Gussing Game
 */
import java.util.Scanner;
public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = (int)(101*Math.random()); // random number between 0-100

        System.out.println("Enter A Number 1 to 100 Range");
        int UserNumber = sc.nextInt();

        if(number==UserNumber){
            System.out.println("Congratulations");
            System.out.println("System Genarate Number" + number);
            System.out.println("User Input Number" + UserNumber);
        }

        else{
            System.out.println("Better Luck Next Time");
            System.out.println("System Genarate Number"+" "+number);
            System.out.println("User Input Number"+" "+UserNumber);
        }

        sc.close();
}
}
