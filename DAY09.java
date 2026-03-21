public class DAY9 {
    public static void main(String[] args) {
        // JAVA switch statement
        // Instead of writing many if..else statements, you can use the switch
        // statement.

        // Think of it like ordering food in a restaurant: If you choose number 1, you
        // get Pizza. If you choose 2, you get a Burger. If you choose 3, you get Pasta.
        // Otherwise, you get nothing.

        // The switch statement selects one of many code blocks to be executed:
        // always inside sitch(-> here we put the variable that we want to compare with
        // the cases i.e constants like number or char or fixed value ) and then we put
        // the cases and then we put the break statement to stop the switch after the
        // matching case has run and then we put the default statement to run if there
        // is no match

        // switch(expression) {
        // case x:
        // // code block
        // break;
        // case y:
        // // code block
        // break;
        // default:
        // // code block
        // }

        // This is how it works:

        // The switch expression is evaluated once.
        // The result is compared with each case value.
        // If there is a match, the matching block of code runs.
        // The break statement stops the switch after the matching case has run.
        // The default statement runs if there is no match.

        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
        // When Java reaches a break keyword, it breaks out of the switch block.
        // This will stop the execution of more code and case testing inside the block.
        // When a match is found, and the job is done, it's time for a break. There is
        // no need for more testing.
        // multiple cases can have the same code block. When a match is found, the code
        // block will be executed.
        int day1 = 3;
        switch (day1) {
            case 1:
            case 2:
            case 3:
                System.out.println("Weekday");
                break;
            case 4:
            case 5:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day");
        }

        // for merging multiple cases we can write also like this  and -> it automaticaly takes the break statement and we dont need to write it explicitly and also we can write multiple cases in one line like this
       switch (day1) {
    case 1, 2, 3 -> System.out.println("Weekday");
    case 4, 5 -> System.out.println("Weekend");
    default -> System.out.println("Invalid day");
}


    }
}
