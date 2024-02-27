import java.util.Scanner;

/**
 * Author: AyshaCader
 * Email: ayshacader2001@gmail.com
 * Date: 27/02/2024
 * Description: Find the mode of an array
 */

public class Mode {

    public static void main(String args[]) {
        int array[] = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");

        for (int i = 0; i < 5; i++) {
            array[i] = sc.nextInt();
        }

        int mode = 0;
        int maxCount = 0;

        for (int n = 0; n < 5; n++) {
            int count = 0;

            for (int m = 0; m < 5; m++) {
                if (array[n] == array[m]) {
                    count++;
                }
                if (count > maxCount) {
                    maxCount = count;
                    mode = array[n];
                }
            }
        }
        sc.close();
        System.out.println("Mode: " + mode);
    }

}
