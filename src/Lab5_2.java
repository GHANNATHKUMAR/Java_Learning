// Program to calculate area and perimeter using method overloading
//Task B. Write a Java program to create a class ShapeCalculator with overloaded methods to calculate the area and perimeter of a circle, rectangle, triangle, and square.
class ShapeCalculator {
    double area(double r) {
        return 3.14 * r * r;
    }

    double perimeter(double r) {
        return 2 * 3.14 * r;
    }

    // rectangle
    double area(double l, double b) {
        return l * b;
    }

    double perimeter(double l, double b) {
        return 2 * (l + b);
    }

    // square
    int area(int side) {
        return side * side;
    }

    int perimeter(int side) {
        return 4 * side;
    }

    // triangle (Heron’s formula)
    double area(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    double perimeter(double a, double b, double c) {
        return a + b + c;
    }
}

public class Lab5_2 {
    public static void main(String[] args) {
        ShapeCalculator sc = new ShapeCalculator();
        System.out.println("Circle area = " + sc.area(5));
        System.out.println("Circle perimeter = " + sc.perimeter(5));
        System.out.println("Rectangle area = " + sc.area(10, 6));
        System.out.println("Rectangle perimeter = " + sc.perimeter(10, 6));
        System.out.println("Square area = " + sc.area(4));
        System.out.println("Square perimeter = " + sc.perimeter(4));
        System.out.println("Triangle area = " + sc.area(3, 4, 5));
        System.out.println("Triangle perimeter = " + sc.perimeter(3, 4, 5));
    }
}
