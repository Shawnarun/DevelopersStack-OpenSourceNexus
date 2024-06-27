 /* 
  * Aurthor - Vignes
  * Mail-id - vikey.vignes2002@gmail.com
  * Date - 2024/06/24
  * Description - Simple Multiplication Chart Genarator & Simple Multiplicator :)
  */

import java.util.Scanner;

public class multiplicationChart {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.println("--------------------------------------------\n"
                + " Welcome to Multiplication chart Generator \n" + "--------------------------------------------");
        System.out.println("01 . For Multiplication Chart");
        System.out.println("02 . For Multiply Two Values\n");

        Scanner scan = new Scanner(System.in);

        System.out.print("Choose 1 \\ 2 :- ");
        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                System.out.print("\033[H\033[2J");
                System.out.print("Enter First Multiplyer :- ");
                int first = scan.nextInt();
                System.out.print("How Many Times Need :- ");
                int times = scan.nextInt();
                System.out.println("\n Here Your Table.\n------------------");

                for (int i = 1; i <= times; i++) {

                    System.out.println(first + " x " + i + " = " + first * i);
                }
                System.out.println("------------\n thank you \n------------\n");
                break;

            case 2:
                System.out.print("\033[H\033[2J");
                System.out.print("Enter First Number :- ");
                int firNum = scan.nextInt();
                System.out.print("Enter Second Number :- ");
                int secNum = scan.nextInt();

                System.out.println("\nValue is :- "+firNum+" x "+ secNum + " = " + firNum*secNum);
                break;

            default:System.out.println("\n------------------------------------------\n Not a Valid Input. Try Again. Thank you \n------------------------------------------");
                break;
        }
            scan.close();
    }

}
