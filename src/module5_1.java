import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class module5_1 {
    static int fun() {
        return 13 / 0;
    }

    static void fun1(int age) { // custom validation
        if (age >= 18) {
            NullPointerException obj = new NullPointerException("The input string cannot be null.");
            throw obj;
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println(13 / 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("kaam done");
        }
        try {
            System.out.println(fun());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("kaam done");
        }
        try {
            fun1(89);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(" fun1 ka kaam done");
        }
        System.out.println("hello brother");

        try {
            File file = new File("nonexistent.txt");
            FileReader reader = new FileReader(file);
            // This may throw a
            //FileNotFoundException
        } catch (IOException e) {
            System.out.println("An IOException occurred: " + e.getMessage());
        }
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // This will throw ArrayIndexOutOfBoundsException
        } finally {
            System.out.println("Finally block executed - Exception unhandled case.");
        }
        System.out.println("This line will not execute due to unhandled exception.");
    }
}
