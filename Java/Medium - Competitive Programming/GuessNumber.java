/*
* Author :Thayuran
* Email : thayuran1998@gmail.com
* Date : 19 feb 2024
* Description : simple console game where you have to guess a hidden number
*/

/*
 * Author : musaraf
 * Email : nowsathmusaraf037@gmail.com
 * Date : 25/06/2024
 * Description : Remove Warning Message
 */
import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
   
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
      
        int number = rand.nextInt(10), guess, countGuess = 0, maxGuess = 3;
        boolean outOfGuess = false;

        while (!outOfGuess) {
            if (countGuess < maxGuess) {
                System.out.println((maxGuess - countGuess) + " guesses left");
                System.out.print("Guess: ");
                guess = input.nextInt();

                if (guess == number) {
                    System.out.println("You win");
                    break;
                }
                countGuess++;
            } else {
                System.out.println("You lost\nOur number was " + number);
                outOfGuess = true;
            }
        }
        input.close();
    }
}