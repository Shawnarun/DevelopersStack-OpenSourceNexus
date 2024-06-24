/*
* Author :Thayuran
* Email : thayuran1998@gmail.com
* Date : 26 feb 2024
* Description : Calculate the Electricity Bill
*/
/*
 * Author : musaraf
 * Email : nowsathmusaraf037@gmail.com
 * Date : 24/06/2024
 * Description : Scanner closed
 */
import java.util.*; 

class ElectricityBill { 
    public static void main(String args[]) {   
        long units;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\t\t Home Electricity bill Calculator \n");
        
        
        do {
            System.out.print("Enter number of units (should be non-negative): ");
            while (!sc.hasNextLong()) {
                System.out.println("Invalid input! Please enter a number.");
                System.out.print("Enter number of units (should be non-negative): ");
                sc.next(); 
            }
            units = sc.nextLong();
            if (units < 0)
                System.out.println("Units cannot be negative. Please enter a non-negative value.");
        } while (units < 0);

        double billpay = 0;

        if(units <= 64)
            billpay = units * 38.0;
        else if(units <= 96)
            billpay = 64 * 38.0 + (units - 64) * 41;
        else if(units <= 128)
            billpay = 64 * 38.0 + 32 * 41.0 + (units - 96) * 59.0;
        else
            billpay = 64 * 38.0 + 32 * 41.0 + 32 * 59.0 + (units - 128) * 59.0;

        System.out.println("Bill to pay: Rs " + billpay); 

        sc.close();
    } 
}  
