import java.util.ArrayList;

public class DAY3 {
    // byte Stores whole numbers from -128 to 127
    // short Stores whole numbers from -32,768 to 32,767
    // int Stores whole numbers from -2,147,483,648 to 2,147,483,647
    // long Stores whole numbers from -9,223,372,036,854,775,808 to
    // 9,223,372,036,854,775,807
    // float Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
    // double Stores fractional numbers. Sufficient for storing 15 to 16 decimal
    // digits
    // boolean Stores true or false values
    // char Stores a single character/letter or ASCII values
    public static void main(String args[]) {
        byte num = 100;
        // byte 1byte
        short num1 = 100;
        // short 2byte
        int num2 = 10000;
        // int 4byte
        long num3 = 10000000000L;
        // long 8byte
        float num4 = 3.14f;
        // float 4byte
        double num5 = 3.1415926535897932384626433832795;
        // double 8byte
        boolean isJavaFun = true;
        // boolean 1byte
        char grade = 'A';
        // char 2byte
        System.out.println("byte value: " + num);
        System.out.println("short value: " + num1);
        // signed case -2^n-1 to 2^n-1-1
        // unsigned case 0 to 2^n-1

        // Non-primitive data types are called reference types because they refer to
        // objects.

        // // The main differences between primitive and non-primitive data types are:
        // Primitive types in Java are predefined and built into the language, while
        // non-primitive types are created by the programmer (except for String).
        // Non-primitive types can be used to call methods to perform certain
        // operations, whereas primitive types cannot.
        // Primitive types start with a lowercase letter (like int), while non-primitive
        // types typically starts with an uppercase letter (like String).
        // Primitive types always hold a value, whereas non-primitive types can be null.
        // Examples of non-primitive types are Strings, Arrays, Classes etc.

        // // The var keyword was introduced in Java 10 (released in 2018).

        // The var keyword lets the compiler automatically detect the type of a variable
        // based on the value you assign to it.
        // 1. var only works when you assign a value at the same time (you can't declare
        // var x; without assigning a value)..
        var x = 5; // x is now an int
        x = 10; // OK - still an int
        // x = 9.99; // Error - can't assign a double to an int

        // For simple variables, it's usually clearer to write the type directly (int,
        // double, char, etc.).
        // But for more complex types, such as ArrayList or HashMap, var can make the
        // code shorter and easier to read:
         ArrayList<String> cars = new ArrayList<String>();
        // // With var
        var cars1 = new ArrayList<String>();

    }
}
