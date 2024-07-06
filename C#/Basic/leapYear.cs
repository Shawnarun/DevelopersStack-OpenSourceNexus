/*
 * Author : musaraf
 * Email : nowsathmusaraf037@gmail.com
 * Date : 24/06/2024
 * Description : Error Correction
 */

 namespace leapYear{
    class program{
        static void main(string [] args){
            Console.WriteLine("Enter The Year");
            int year = int.Parse(Console.ReadLine());
            if(year % 4 == 0 && year % 100 != 0 || year %==0){
                Console.WriteLine("Leap Year");
            }
            else{
                Console.WriteLine("Not Leap Year");
            }
        }
    }
 }