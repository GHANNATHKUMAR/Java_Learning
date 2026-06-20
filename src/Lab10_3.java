import java.io.FileWriter;
import java.io.IOException;

public class Lab10_3 {

    public static void main(String[] args) {
        int[] arr = {10, 20, 0, 40};
        // Contains a ZERO → will cause ArithmeticException (division)
        // Will purposely access invalid index → ArrayIndexOutOfBoundsException

        FileWriter writer = null;

        try {
            writer = new FileWriter("output.txt");

            for (int i = 0; i <= arr.length; i++) { // <= triggers out-of-bounds
                int value = arr[i];

                // Perform arithmetic operation to raise ArithmeticException
                int result = 100 / value; // value = 0 will trigger exception

                writer.write("Value: " + value + ", Result: " + result + "\n");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Tried to access invalid array index!");

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");

        } catch (IOException e) {
            System.out.println("Error: Problem occurred while writing to file!");

        } finally {
            System.out.println("File processing completed");

            try {
                if (writer != null)
                    writer.close();
            } catch (IOException e) {
                System.out.println("Error closing the file!");
            }
        }
    }
}

