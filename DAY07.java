public class DAY7 {
    public static void main(String[] args) {
        // 1.Math.max(x,y) method is used to find the maximum of two numbers x and y and
        // it returns the maximum of x and y
        // 2.Math.min(x,y) method is used to find the minimum of two numbers x and y and
        // it returns the minimum of x and y
        // 3.Math.abs(x) method is used to find the absolute value of a number x and it
        // returns the absolute value of x
        // 4. Math.sqrt(x) method is used to find the square root of a number x and it
        // returns the square root of x
        // 5 . Math.pow(x,y) method is used to find the value of x raised to the power
        // of y and it returns the value of x raised to the power of y
        // Math.round(x) method is used to round a number x to the nearest integer and
        // it returns the rounded value of x
        // Math.ceil(x) method is used to round a number x to the nearest integer that
        // is greater than or equal to x and it returns the rounded value of x
        // Math.floor(x) method is used to round a number x to the nearest integer that
        // is less than or equal to x and it returns the rounded value of x
        // Math.random() method is used to generate a random number between 0.0 and 1.0
        // and it returns the random number generated between 0.0 and 1.0

        System.out.println(Math.max(10, 20)); // 20 because 20 is greater than 10
        System.out.println(Math.min(10, 20)); // 10 because 10 is less than 20
        System.out.println(Math.abs(-10)); // 10 because the absolute value of -10 is 10
        System.out.println(Math.sqrt(16)); // 4.0 because the square root of 16 is 4.0
        System.out.println(Math.abs(-4.7)); // 4.7 because the absolute value of -4.7 is 4.7
        System.out.println(Math.pow(2.3, 3)); // 12.167 because the value of 2.3 raised to the power of 3 is 12.167
        System.out.println(Math.pow(2, 3)); // 8.0 because the value of 2 raised to the power of 3 is 8.0
        System.out.println(Math.round(4.7)); // 5 because 4.7 is rounded to the nearest integer which is 5
        System.out.println(Math.round(4.4)); // 4 because 4.4 is rounded to the nearest integer which is 4
        System.out.println(Math.ceil(4.4)); // 5.0 because 4.4 is rounded to the nearest integer that is greater than or
                                            // equal to 4.4 which is 5.0
        System.out.println(Math.ceil(4.7)); // 5.0 because 4.7 is rounded to the nearest integer that is greater than or
                                            // equal to 4.7 which is 5.0
        System.out.println(Math.floor(4.4)); // 4.0 because 4.4 is rounded to the nearest integer that is less than or
                                             // equal to 4.4 which is 4.0
        System.out.println(Math.floor(4.7)); // 4.0 because 4.7 is rounded to the nearest integer that is less than or
                                             // equal to 4.7 which is 4.0
        System.out.println(Math.random()); // it will print a random number between 0.0 and 1.0 every time you run the
                                           // program because it generates a random number between 0.0 and 1.0
        System.out.println((int) (Math.random() * 100)); // it will print a random number between 0 and 99 every time
                                                         // you run the program because it generates a random number
                                                         // between 0.0 and 1.0 and then multiplies it by 100 and then
                                                         // casts it to an integer which will give a random number
                                                         // between 0 and 99
        System.out.println((int) (Math.random() * 101)); // it will print a random number between 0 and 100 every time
                                                         // you run the program because it generates a random number
                                                         // between 0.0 and 1.0 and then multiplies it by 101 and then
                                                         // casts it to an integer which will give a random number
                                                         // between 0 and 100
        // Note: Math.random() returns a double. To get an integer, you need to cast it
        // with (int).
    }
}
