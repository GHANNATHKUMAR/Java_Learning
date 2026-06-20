public class Lab7_2 {
    public static void main(String[] args) {
        // Step 1: Create a String that contains a numerical value
        String numberStr = "123";
        System.out.println("Original String: " + numberStr);
        // Step 2: Convert the String to an int using Integer wrapper class
        int number = Integer.parseInt(numberStr);
        System.out.println("Converted to int: " + number);
        // Step 3: Perform a mathematical operation (add 50)
        number += 50;
        System.out.println("After adding 50: " + number);

        // Step 4: Convert the int back to a String and display the result
        String resultStr = Integer.toString(number);
        System.out.println("Converted back to String: " + resultStr);
    }
}
