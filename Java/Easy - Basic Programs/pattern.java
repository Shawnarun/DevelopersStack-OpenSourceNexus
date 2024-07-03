/**
 * Author: AyshaCader
 * Email: ayshacader2001@gmail.com
 * Date: 21/02/2024
 * Description: Star patterns
 */

public class pattern {

    public static void main(String[] args) {

        // Triangular pattern

        int i, j, k, l;
        for (i = 1; i <= 5; i++) {
            for (j = i; j < 5; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print("*");
            }
            for (l = 1; l < i; l++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        // semi triangular pattern (increment in ascending)
        int x, y;

        for (x = 1; x <= 6; x++) {
            for (y = 1; y < x; y++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        // semi triangular pattern (decrement in descending)

        int a, b;

        for (a = 5; a >= 1; a--) {
            for (b = 1; b <= a; b++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

}
