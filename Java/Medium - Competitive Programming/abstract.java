/*
* Author : thushaonline
* Gmail : rajthusha99@gmail.com
* Date : 19.02.2024
* Description :  Abstract class
*/

abstract class Shape {
    public abstract double area();
    public void display() {
        System.out.println("This is a shape.");
    }
}
class Rectangle extends Shape {
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double area() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double area() {
        return Math.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 3);
        Shape circle = new Circle(4);

        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Area of Circle: " + circle.area());

        rectangle.display();
        circle.display();
    }
}
