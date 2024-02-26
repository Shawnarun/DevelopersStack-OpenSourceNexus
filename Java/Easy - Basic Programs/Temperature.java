
/**
Author: AyshaCader
Email: ayshacader20001@gmail.com
Date: 26/02/2024
Description: Converting fahrenheit to celcius or celcius to fahrenheit
 */

import java.util.*;

public class Temperature {

    public static float fer(float a) {

        return a * 1.8f + 32;

    }

    public static float cel(float a) {

        return (a - 32) * 0.5555f;

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the temperature");
        Float a = s.nextFloat();

        System.out.println("Convert to:(enter F(Fahrenheit) or C(Celsius))");
        char b = s.next().charAt(0);

        Float Celsius = fer(a);
        Float Fahrenheit = cel(a);

        if (b == 'F' || b == 'f') {
            System.out.println("Celsius to Fahrenheit: " + Celsius);
        } else if (b == 'C' || b == 'c') {
            System.out.println("Fahrenheit to Celsius: " + Fahrenheit);
        } else {
            System.out.println("Incorrect entry");
        }

    }

}
