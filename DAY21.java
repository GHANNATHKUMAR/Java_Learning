public class DAY21 {
  static void myMethod() {
    System.out.println("Hello World!");
  }

  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }

  // Create a speed() method and add a parameter
  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }

  public static void main(String args[]) {
    myMethod(); // it can be called withoud object and also with object becuase this method is
                // static
    DAY21 myCar = new DAY21(); // Create a myCar object
    myCar.fullThrottle(); // Call the fullThrottle() method
    myCar.speed(200); // Call the speed() method

  }
}
