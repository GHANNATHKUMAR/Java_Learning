class Address {
    String city;
    String state;

    Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    // Copy constructor for deep copy
    Address(Address other) {
        this.city = other.city;
        this.state = other.state;
    }

    @Override
    public String toString() {
        return city + ", " + state;
    }
}

class Student {
    int id;
    String name;
    Address address;

    Student(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    // Shallow copy method
    Student shallowCopy() {
        return new Student(this.id, this.name, this.address);
    }

    // Deep copy method
    Student deepCopy() {
        return new Student(this.id, this.name, new Address(this.address));
    }

    @Override
    public String toString() {
        return "Student ID: " + id + ", Name: " + name + ", Address: " + address;
    }
}

public class Lab7 {
    public static void main(String[] args) {
        // Create original student
        Address addr = new Address("Delhi", "Delhi");
        Student original = new Student(1, "John", addr);

        // Perform shallow copy
        Student shallow = original.shallowCopy();

        // Perform deep copy
        Student deep = original.deepCopy();

        System.out.println("=== Before modifying copied objects ===");
        System.out.println("Original: " + original);
        System.out.println("Shallow Copy: " + shallow);
        System.out.println("Deep Copy: " + deep);

        // Modify shallow copy's address
        shallow.address.city = "Mumbai";
        shallow.address.state = "Maharashtra";

        // Modify deep copy's address
        deep.address.city = "Bangalore";
        deep.address.state = "Karnataka";

        System.out.println("\n=== After modifying copied objects ===");
        System.out.println("Original: " + original);
        System.out.println("Shallow Copy: " + shallow);
        System.out.println("Deep Copy: " + deep);
    }
}
