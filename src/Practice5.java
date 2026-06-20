import java.util.Scanner;

public class Practice5 {
    // - The switch statement is used to handle different user choices.
    //- The break statement is used to exit the switch block after executing the corresponding case.
    //- Another break statement is used to exit the while loop when the user chooses to exit.
    //
    //Note that the break statement only exits the innermost loop or switch block. If you need to exit an outer loop, you can use a labeled break statement.
    //
    //To use a labeled break, you would label the loop and then use the label with the break statement:
    //
    //
    //loopLabel: while (true) {
    //    // ...
    //    if (choice == 5) {
    //        break loopLabel;
    //    }
    //}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                break;
            }
        } // 2
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 2) {
                    continue; // Skip to the next iteration of the outer loop
                }
                System.out.println(j);
            }
        }// output 13 13 13


    }
}
