/*
* Author : musaraf
* Email : nowsathmusaraf037@gmail.com
* Date : 11/07/2024
* Description : choice a shape calculate area & circumference
*/

namespace shape{
    class program{
        void rectangle(){


        Console.WriteLine("Enter the length of the rectangle : ");
        double length = Convert.ToDouble(Console.ReadLine());
        Console.WriteLine("Enter the width of the rectangle : ");
        double width = Convert.ToDouble(Console.ReadLine());
        double area = length * width;
        double circumference = 2 * (length + width);

        Console.WriteLine("Rectangle Area is : "+area);
        Console.WriteLine("Rectangle Circumference is : "+circumference);

    }
    void circle(){

        const double PI = 3.14;
        Console.WriteLine("Enter the radius of the circle : ");
        double radius = Convert.ToDouble(Console.ReadLine());
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;

        Console.WriteLine("Circle Area is : "+area);
        Console.WriteLine("Circle Circumference is : "+circumference);

    }
    void square(){


        Console.WriteLine("Enter the length of the rectangle");
        double length = Convert.ToDouble(Console.ReadLine());
        double area = length * length;
        double circumference = 4 * length;

        Console.WriteLine("Square Area is : "+area);
        Console.WriteLine("Square Circumference is : "+circumference);

    }
    void triangle(){

        Console.WriteLine("Enter the length of the triangle");
        double length = Convert.ToDouble(Console.ReadLine());
        Console.WriteLine("Enter the width of the triangle");
        double width = Convert.ToDouble(Console.ReadLine());
        
        double area = length * width / 2;
        double circumference = length + width + Math.sqrt(length * length + width * width);

        Console.WriteLine("Triangle Are is : "+area);
        Console.WriteLine("Triangle Circumference is : "+circumference);

    }
    public static void main(String [] args){

        Console.WriteLine("Enter the shape NO");
        Console.WriteLine("1. Rectangle");
        Console.WriteLine("2. circle");
        Console.WriteLine("3. square");
        Console.WriteLine("4. Triangle");

        int shape = Convert.ToInt32(Console.ReadLine());

        switch (shape) {
            case 1:
                rectangle();
                break;
            case 2:
                circle();
                break;
            case 3:
                square();
                break;
            case 4:
                triangle();
                break;

            default:
            Console.WriteLine("Invalid Shape NO");
        }
    }
    }
}