// Abstract class Vehicle
abstract class Vehicle8 {
    String model;
    String color;
    // Constructor to initialize common attributes
    Vehicle8(String model, String color) {
        this.model = model;
        this.color = color;
    }

    // Abstract method to be implemented by subclasses
    abstract void displayInfo();
}

// Car class extending Vehicle
class Car4 extends Vehicle8 {
    int doors;

    Car4(String model, String color, int doors) {
        super(model, color);   // Call Vehicle constructor
        this.doors = doors;
    }

    // Implement abstract method
    void displayInfo() {
        System.out.println("Car Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Doors: " + doors);
    }
}

// Bike class extending Vehicle
class Bike4 extends Vehicle8 {
    boolean hasCarrier;

    Bike4(String model, String color, boolean hasCarrier) {
        super(model, color);   // Call Vehicle constructor
        this.hasCarrier = hasCarrier;
    }

    // Implement abstract method
    void displayInfo() {
        System.out.println("Bike Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Has Carrier: " + hasCarrier);
    }
}

// Main class
public class endsem5 { // test vehicles
    public static void main(String[] args) {
        // Create objects using abstract class reference
        Vehicle8 v1 = new Car4("Toyota", "Red", 4);
        Vehicle8 v2 = new Bike4("Honda", "Blue", true);

        // Display information
        v1.displayInfo();
        System.out.println();
        v2.displayInfo();
    }
}

