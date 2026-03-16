public class DAY15 {
    // If you want the method to return a value, you can use a primitive data type
    // (such as int, char, etc.) instead of void, and use the return keyword inside
    // the method:

    static int myMethod(int x) {
        return 5 + x;
    }

    // This example returns the sum of a method's two parameters:
    static int myMethod(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println(myMethod(3)); // Outputs 8 (5 + 3)
        System.out.println(myMethod(5, 3)); // Outputs 8 (5 + 3)
        int z = myMethod(5, 3);
        System.out.println(z); // 8
    }
}
