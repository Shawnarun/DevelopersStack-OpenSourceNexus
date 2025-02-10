/*
 * Author:JJPravin
 * Email-jegapravinj2000@gmail.com
 * Date-10/02/2025
 * Description-An anagram checker program in Java
 */

import java.util.*;

public class AnagramChecker {
    
    // Function to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        // If lengths are different, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }
        
        // Convert both strings to character arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        
        // Sort both character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
        // Compare the sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(areAnagrams("listen", "silent"));  // Should return true
        System.out.println(areAnagrams("triangle", "integral")); // Should return true
        System.out.println(areAnagrams("apple", "pale"));      // Should return false
    }
}
