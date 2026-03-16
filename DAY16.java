
public class DAY16 {
    // Method Overloading
    // With method overloading, multiple methods can have the same name with
    // different parameters:
    // and method overriding happens in inheritance
    static int plusMethodInt(int x, int y) {
        return x + y;
    }

    static double plusMethodDouble(double x, double y) {
        return x + y;
    }

    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    public static void main(String args[]) {
        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1); // int: 13
        System.out.println("double: " + myNum2); // double: 10.559999999999999
    }

}
