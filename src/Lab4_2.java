import java.util.Scanner;

// Class to represent a Complex Number
class Complex {
    private double real;
    private double imag;

    // Constructor
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Addition
    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imag + other.imag);
    }

    // Subtraction
    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imag - other.imag);
    }

    // Multiplication
    public Complex multiply(Complex other) {
        double r = (this.real * other.real) - (this.imag * other.imag);
        double i = (this.real * other.imag) + (this.imag * other.real);
        return new Complex(r, i);
    }

    // Division
    public Complex divide(Complex other) {
        double denominator = (other.real * other.real) + (other.imag * other.imag);
        double r = ((this.real * other.real) + (this.imag * other.imag)) / denominator;
        double i = ((this.imag * other.real) - (this.real * other.imag)) / denominator;
        return new Complex(r, i);
    }

    // Convert to String
    @Override
    public String toString() {
        if (imag >= 0) {
            return real + " + " + imag + "i";
        } else {
            return real + " - " + (-imag) + "i";
        }
    }
}

// Demo class
public class Lab4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // First Complex Number
        System.out.print("Enter real part of first complex number: ");
        double real1 = sc.nextDouble();
        System.out.print("Enter imaginary part of first complex number: ");
        double imag1 = sc.nextDouble();
        Complex c1 = new Complex(real1, imag1);
        // Second Complex Number
        System.out.print("\nEnter real part of second complex number: ");
        double real2 = sc.nextDouble();
        System.out.print("Enter imaginary part of second complex number: ");
        double imag2 = sc.nextDouble();
        Complex c2 = new Complex(real2, imag2);
        // Display
        System.out.println("\nFirst Complex Number: " + c1);
        System.out.println("Second Complex Number: " + c2);
        // Operations
        System.out.println("\nResults:");
        System.out.println("Addition: " + c1.add(c2));
        System.out.println("Subtraction: " + c1.subtract(c2));
        System.out.println("Multiplication: " + c1.multiply(c2));
        System.out.println("Division: " + c1.divide(c2));
        sc.close();
    }
}

