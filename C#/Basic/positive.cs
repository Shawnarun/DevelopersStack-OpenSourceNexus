/*
* Author : musaraf
* Email : nowsathmusaraf037@gmail.com
* Date : 09/07/2024
* Description : check user given number positive or negative
*/

namespace positive{
    class program{
        static void main(string [] args){
            
            int num = Convert.ToInt32(Console.ReadLine());

            if(num > 0){
                Console.WriteLine("positive");
            }
            else if(num==0){
                Console.WriteLine("zero");
            }
            else{
                Console.WriteLine("Negative");
            }
        }
    }
}