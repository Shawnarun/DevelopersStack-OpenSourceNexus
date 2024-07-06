/*
 * Author : musaraf
 * Email : nowsathmusaraf037@gmail.com
 * Date : 06/07/224
 * Description : Calculate of the area
 */
import java.util.Scanner;
public class circle {
    public static void main(String [] args){
        final double PI =3.14;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double radius = sc.nextDouble();
        double area = PI * radius * radius;
        System.out.println("Area of the circle : "+ area);

        sc.close();
    }
}
