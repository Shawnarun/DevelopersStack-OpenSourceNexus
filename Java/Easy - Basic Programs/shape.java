/*
 * Author : musaraf
 * Email : nowsathmusaraf037@gmail.com
 * Date : 09/07/2024
 * Description : user what the shape area or circumference
 */

 import java.util.Scanner;
public class shape {

    public static void rectangle(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle : ");
        double length = sc.nextDouble();
        System.out.print("Enter the width of the rectangle : ");
        double width = sc.nextDouble();
        double area = length * width;
        double circumference = 2 * (length + width);

        System.out.println("Rectangle Area is : "+area);
        System.out.println("Rectangle Circumference is : "+circumference);

        sc.close();
    }
    public static void circle(){

        Scanner sc = new Scanner(System.in);

        final double PI = 3.14;
        System.out.print("Enter the radius of the circle : ");
        double radius = sc.nextDouble();
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;

        System.out.println("Circle Area is : "+area);
        System.out.println("Circle Circumference is : "+circumference);

        sc.close();
    }
    public static void square(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle");
        double length = sc.nextDouble();
        double area = length * length;
        double circumference = 4 * length;

        System.out.println("Square Area is : "+area);
        System.out.println("Square Circumference is : "+circumference);

        sc.close();
    }
    public static void triangle(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the triangle");
        double length = sc.nextDouble();
        System.out.println("Enter the width of the triangle");
        double width = sc.nextDouble();
        
        double area = length * width / 2;
        double circumference = length + width + Math.sqrt(length * length + width * width);

        System.out.println("Triangle Are is : "+area);
        System.out.println("Triangle Circumference is : "+circumference);

        sc.close();
    }
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the shape NO");
        System.out.println("1. Rectangle");
        System.out.println("2. circle");
        System.out.println("3. square");
        System.out.println("4. Triangle");

        int shape = sc.nextInt();

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
            System.out.println("Invalid Shape NO");
        }
        sc.close();
    }
}
