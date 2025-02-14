/*
 * Author: JJPravin
 * Email: jegapravinj2000@gmail.com
 * Date: 10/02/2025
 * Description: A complex palindrome checker program in Java with additional features.
 */

 import java.util.*;

 public class AdvancedPalindromeChecker {
     
     // Function to check if a string is a palindrome (ignores case and non-alphanumeric characters)
     public static boolean isPalindrome(String str) {
         str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
         int left = 0, right = str.length() - 1;
         
         while (left < right) {
             if (str.charAt(left) != str.charAt(right)) {
                 return false;
             }
             left++;
             right--;
         }
         
         return true;
     }
     
     // Function to check if an integer is a palindrome
     public static boolean isPalindrome(int num) {
         int original = num, reversed = 0;
         while (num > 0) {
             reversed = reversed * 10 + num % 10;
             num /= 10;
         }
         return original == reversed;
     }
 
     public static void main(String[] args) {
         // Test cases for string palindrome
         System.out.println(isPalindrome("A man, a plan, a canal, Panama"));  // Should return true
         System.out.println(isPalindrome("Was it a car or a cat I saw?")); // Should return true
         System.out.println(isPalindrome("hello"));   // Should return false
 
         // Test cases for integer palindrome
         System.out.println(isPalindrome(121));  // Should return true
         System.out.println(isPalindrome(12321)); // Should return true
         System.out.println(isPalindrome(123));   // Should return false
     }
 }
 