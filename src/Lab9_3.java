// Base class Vehicle

import java.util.*;

abstract class Vehicle {
    protected String vehicleNumber;
    protected String vehicleType;
    protected double rentalPricePerDay;

    public Vehicle(String vehicleNumber, String vehicleType, double rentalPricePerDay) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Rental Price per Day: $" + rentalPricePerDay);
    }

    // Abstract method to calculate rental cost
    public abstract double calculateRentalCost(int days);
}

// Car class extending Vehicle
class Car extends Vehicle {
    private int seatingCapacity;

    public Car(String vehicleNumber, double rentalPricePerDay, int seatingCapacity) {
        super(vehicleNumber, "Car", rentalPricePerDay);
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Seating Capacity: " + seatingCapacity);
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalPricePerDay * days; // Simple calculation, can add extra charges
    }
}

// Bike class extending Vehicle
class Bike extends Vehicle {
    private int engineCapacity;

    public Bike(String vehicleNumber, double rentalPricePerDay, int engineCapacity) {
        super(vehicleNumber, "Bike", rentalPricePerDay);
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Engine Capacity: " + engineCapacity + "cc");
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalPricePerDay * days; // Simple calculation
    }
}

public class Lab9_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating a Car
        Car car = new Car("CAR123", 50.0, 5); // $50 per day, 5 seats
        System.out.println("Car Details:");
        car.displayDetails();
        System.out.print("Enter number of days to rent the car: ");
        int carDays = sc.nextInt();
        System.out.println("Total Rental Cost: $" + car.calculateRentalCost(carDays));

        System.out.println();

        // Creating a Bike
        Bike bike = new Bike("BIKE456", 20.0, 150); // $20 per day, 150cc
        System.out.println("Bike Details:");
        bike.displayDetails();
        System.out.print("Enter number of days to rent the bike: ");
        int bikeDays = sc.nextInt();
        System.out.println("Total Rental Cost: $" + bike.calculateRentalCost(bikeDays));
    }
}

