/* Author - Musaraf
*Email -  nowsathmusaraf037@gamil.com
*Date -   03/07/2024
*Description - basic calculator
*/

namespace calculator{
    class program{
        static void Main(string [] args){
            Console.WriteLine("Enter First Number");
            int a = COnvert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter Second Number");
            int b = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Choice A Operator");
            Console.WriteLine("+");
            Console.WriteLine("-");
            Console.WriteLine("*");
            Console.WriteLine("/");

            char op = Convert.ToChar(Console.ReadLine());
            double result=0;
            switch(op){
                case '+':
                Console.WriteLine("Sum is "+" "+a+b);
                break;

                case'-':
                Console.WriteLine("Subtraction is "+" "+a-b);
                break;

                case '*':
                Console.WriteLine("Multiplication is "+" "+a*b);
                break;

                case '/':
                Console.WriteLine("Division is "+" "+a/b);
                break;

                default:
                Console.WriteLine("Invalid Operator");
            }
        }
    }
}