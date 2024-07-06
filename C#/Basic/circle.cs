/*
 * Author : musaraf
 * Email : nowsathmusaraf037@gmail.com
 * Date : 06/07/224
 * Description : Calculate of the area
 */

 namespace circle{
    class program{
        static void main(string [] args){
            const double PI = 3.14;
            Console.WriteLine("Enter Radius");
            double radius = double.Parse(Console.ReadLine());
            double area = PI * radius * radius;
            Console.WriteLine("Area of the circle is " + area);
        }
    }
 }