/*
 * Author : musaraf
 * Email : nowsathmusraf037@gmail.com
 * Date : 25/06/2024
 * Description : Calculate User BMI
 */

 import java.util.Scanner;
public class BMI {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        double height = sc.nextDouble();
        double weight = sc.nextDouble();

        double BMI = (weight/height*height);
        System.out.println("Your BMI is " + BMI);

        if(BMI<=16){
            System.out.println("You are Severe Thinness");
        }
        else if(BMI<17){
            System.out.println("You are Moderate Thinness");
        }
        else if(BMI<18.5){
            System.out.println("You are Mild Thinness");
        }
        else if(BMI<25){
            System.out.println("You are Normal");
        }
        else if(BMI<30){
            System.out.println("You are Overweight");
        }
        else if(BMI<35){
            System.out.println("You are Obese Class I");
        }
        else if(BMI <40){
            System.out.println("You are Obese Class II");
        }
        else{
            System.out.println("You are Obese Class III");
        }

        sc.close();
    }
}
