public class DAY8 {
    public static void main(String[] args) {
        // DAY8-> Java Booleans and IF-ELSE IF - ELSE STAT
        // 1. A boolean is a data type that can only have two possible values: true or
        // false.
        // 2. Booleans are often used in conditional statements to control the flow of a
        // program.
        // 3. An if statement is a conditional statement that executes a block of code
        // if a specified condition is true.
        // 4. An else if statement is a conditional statement that executes a block of
        // code if a specified condition is true, and it is used after an if statement.
        // 5. An else statement is a conditional statement that executes a block of code
        // if all the previous conditions are false, and it is used after an if
        // statement or an else if statement.

        boolean isJavaFun = true;
        boolean isFishTasty = false;

        System.out.println(isJavaFun); // Outputs true
        System.out.println(isFishTasty); // Outputs false
        int x = 10;
        int y = 9;

        System.out.println(x > y); // Outputs true, because 10 is greater than 9

        int myAge = 25;
        int votingAge = 18;

        if (myAge >= votingAge) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enough to vote.");
        }

        // Conditions and if statements let you control the flow of your program -
        // deciding which code runs, and which code is skipped.
        // The else statement lets you run a block of code when the condition in the if
        // statement is false.

        int time = 22;

        if (time < 12) {
            System.out.println("Good morning.");
        } else if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
        // Outputs "Good day."

        // Java Short Hand If...Else (Ternary Operator)
        int time1 = 20;
        System.out.println((time1 < 18) ? "Good day." : "Good evening.");

        // Nested Ternary (Optional)
        int time2 = 22;
        String message = (time2 < 12) ? "Good morning."
                : (time2 < 18) ? "Good afternoon."
                        : "Good evening.";
        System.out.println(message);

        // Java Logical Operators in Conditions
        int a = 200;
        int b = 33;
        int c = 500;

        if (a > b && c > a) {
            System.out.println("Both conditions are true");
        }

        int a1 = 200;
        int b1 = 33;
        int c1 = 500;

        if (a1 > b1 || a1 > c1) {
            System.out.println("At least one condition is true");
        }
        // Note that : if condition 1 is true in OR then next condition will not be
        // checked. If condition 1 is false then condition 2 will be checked.
        // And if first condition is false in AND then next condition will not be
        // checked. If first condition is true then next condition will be checked.
        int a3 = 33;
        int b3 = 200;

        if (!(a3 > b3)) {
            System.out.println("a3 is NOT greater than b3");
        }

        boolean isLoggedIn = true;
        boolean isAdmin = false;
        int securityLevel = 3; // 1 = highest

        if (isLoggedIn && (isAdmin || securityLevel <= 2)) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }

    }
}
