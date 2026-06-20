import java.util.Scanner;

// Abstract class Shape
abstract class Shape {
    // Abstract method calculateArea
    public abstract double calculateArea();
}

// Circle class extending Shape
class Circle extends Shape {
    double radius;

    // Constructor to initialize the radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing calculateArea for Circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;  // Area = π * r^2
    }
}

// Rectangle class extending Shape
class Rectangle extends Shape {
    double length, width;

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing calculateArea for Rectangle
    @Override
    public double calculateArea() {
        return length * width;  // Area = length * width
    }
}

public class Lab9_1 {
    public static void main(String[] args) {
        // Creating Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Circle input and creation
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        Shape circle = new Circle(radius);  // Create Circle object
        System.out.println("Area of the circle: " + circle.calculateArea());

        // Rectangle input and creation
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = sc.nextDouble();
        Shape rectangle = new Rectangle(length, width);  // Create Rectangle object
        System.out.println("Area of the rectangle: " + rectangle.calculateArea());
    }
}

