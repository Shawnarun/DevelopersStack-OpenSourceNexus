/*
* Author : musaraf
* Email : nowsathmusaraf037@gmail.com
* Date : 09/07/2024
* Description : Water bill calculation
*/

namespace waterbill{
    class program{
        static void main(string [] args){
            Console.WriteLine("Enter Water Consume unit");
            int unit = Convert.ToInt32(Console.ReadLine());

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
        }
    }
}