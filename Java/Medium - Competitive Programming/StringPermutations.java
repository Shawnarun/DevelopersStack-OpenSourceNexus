/*
* Author :Thayuran
* Email : thayuran1998@gmail.com
* Date : 17 feb 2024
* Description : Print all permutations of String
*/


import java.util.Scanner;

public class StringPermutations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        scanner.close();
        System.out.println("Permutations of the string " + str + ":");
        printPermutations(str);
    }

    public static void printPermutations(String str) {
        printPermutationsHelper(str.toCharArray(), 0);
    }

    private static void printPermutationsHelper(char[] strArray, int index) {
        if (index == strArray.length - 1) {
            System.out.println(String.valueOf(strArray));
            return;
        }

        for (int i = index; i < strArray.length; i++) {
            swap(strArray, index, i);
            printPermutationsHelper(strArray, index + 1);
            swap(strArray, index, i);
        }
    }

    private static void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
