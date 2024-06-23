/*
 * Author : Musaraf
 * Email : nowsathmusaraf037@gmail.com
 * Date : 23/06/2024
 * Description : Self Water bill calculator
 */
import java.util.Scanner;
public class WaterBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of units consumed: ");
        double units = sc.nextDouble();

        if(units<=50){
            double bill = units * 5;
            System.out.println("Unit consumed : " + units);
            System.out.println("Your Monthly Bill is : " + bill);
        }
        else if(units>51){
            double bill = 50 * 5 + (units - 50) * 10;
            System.out.println("Unit consumed : " + units);
            System.out.println("Your Monthly Bill is : " + bill);
        }
        else{
            double bill = 50*5 + (100-50)*10+ (units-100)*20;
            System.out.println("Unit consumed : " + units);
            System.out.println("Your Monthly Bill is : " + bill);     
        }
        
        sc.close();
    }
}
