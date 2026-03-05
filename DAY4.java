public class DAY4 {
    public static void main(String[] args) {
        // Type castings 
//         Widening Casting (automatic) - converting a smaller type to a larger type size
// byte -> short -> char -> int -> long -> float -> double

// Narrowing Casting (manual) - converting a larger type to a smaller type size
// double -> float -> long -> int -> char -> short -> byte


        int maxScore = 300;
        // The actual score of the user
        int userScore = 1000;
        /*
         * Calculate the percentage of the user's score in relation to the maximum
         * available score.
         * Convert userScore to double to make sure that the division is accurate
         */
        double percentage = (double) userScore / maxScore * 100.00d;
        System.out.println("User's percentage is " + percentage);


//         // operators 
//         +, -, *, /, % (modulus) 
//         /(int /int) -> int
//         /(double / double) -> double
//         ++ (increment) and -- (decrement)
//         postfix (x++) and prefix (++x)
//         postfix and prefix is used on variable not on constants
//         Assignment operators are used to assign values to variables.

// In the example below, we use the assignment operator (=).
// =,+=,-=,*=,/=,%=,<<=
//          */ , &=, ^=, |=, >>=, <<=

// comparison operators are used to compare two values and return a boolean result (true or false).
// ==,!=,<,>,<=,>=

// logical operators are used to combine multiple boolean expressions and return a boolean result.
// && (logical AND), || (logical OR), ! (logical NOT)


// Order of Operations
// Here are some common operators, from highest to lowest priority:

// () - Parentheses
// *, /, % - Multiplication, Division, Modulus
// +, - - Addition, Subtraction
// >, <, >=, <= - Comparison
// ==, != - Equality
// && - Logical AND
// || - Logical OR
// = - Assignment


    }
}
