
/*
* Author :Thayuran
* Email : thayuran1998@gmail.com
* Date : 16 feb 2024
* Description : Roman to Integer
*/

/*
 * Author : musaraf
 * Email : nowsathmusaraf037@gmail.com
 * Date : 25/06/2024
 * Description : Error Correction
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInt {
    public int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int temp = map.get(s.substring(i, i + 1));
            int next = map.get(s.substring(i + 1, i + 2));
            if (temp < next) {
                sum -= temp;
            } else {
                sum += temp;
            }
        }
        sum += map.get(s.substring(s.length() - 1));
        return sum;
    }

    public static void main(String[] args) {
        RomanToInt romanToInt = new RomanToInt();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman number: ");
        String input = scanner.nextLine().toUpperCase(); 
        int result = romanToInt.romanToInt(input);
        System.out.println("The equivalent integer value is: " + result);
        scanner.close();
    }
}
