/* Author - Musaraf
*Email - nowsathmusaraf037@gamil.com
*Date - 03/07/2024
*Description - Find Even Number
*/

namespace findEven{
    class program{
        static void main(string [] args){
            Console.WriteLine("Enter A Number");
            int num = Convert.ToInt32(Console.ReadLine());
            if(num%2==0){
                Console.WriteLine("Even Number");
            }
            else if(num==0){
                Console.WriteLine("Its a Zero");
            }
            else{
                Console.WriteLine("Odd Number");
            }
        }
    }
}