
abstract class Vehicle7 {
    String model;

    // Abstract class constructor
    Vehicle7(String model) {
        this.model = model;
        System.out.println("Vehicle constructor called");
    }

    abstract void drive();
}

class Car8 extends Vehicle7 {
    Car8(String model) {
        super(model);   // Call abstract class constructor
        System.out.println("Car constructor called");
    }

    void drive() {
        System.out.println(model + " is driving");
    }
}

public class endsemexam7 {
    public static void main(String[] args) {
        Car8 c = new Car8("Toyota");  // instantiate subclass
        c.drive();
    }
}

