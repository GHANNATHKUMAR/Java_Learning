class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}


public class module5_2 {
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Invalid age: " + age);
        }
        System.out.println("Age is valid: " + age);
    }


    public static void main(String[] args) {
        try {
            // Define the custom exception
            // Constructor that accepts a custom message
            // Using the custom exception
            validateAge(-5); // This will throw InvalidAgeException
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
