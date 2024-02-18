/*
 *
 * Author : Aysha-Thikra
 * Email : ayshathelegendary@gmail.com
 * Date : 15/02/2024
 * Description : Printing Triangle Star Pattern
 * 
 */


public class TriangleStarPattern {
    public static void main(String[] args) {
        int rows = 5; 

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
