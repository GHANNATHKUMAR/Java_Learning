public class DAY12 {
    public static void main(String arg[]) {
        // Arrays
        // String[] cars;
        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        int[] myNum = { 10, 20, 30, 40 };
        System.out.println(cars[0]);
        // A multidimensional array is an array that contains other arrays.

        // You can use it to store data in a table with rows and columns.

        // To create a two-dimensional array, write each row inside its own curly
        // braces:

        int[][] myNumbers = { { 1, 4, 2 }, { 3, 6, 8 } };
        System.out.println(myNumbers[1][2]); // Outputs 8
    }
}
