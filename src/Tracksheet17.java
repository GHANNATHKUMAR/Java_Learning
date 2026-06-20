import java.util.Scanner;

public class Tracksheet17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Accept a day number between 1-7 and print the corresponding day name.

         */
        System.out.println("Please enter a day number");
        int day = sc.nextInt();
        if (day == 1) System.out.println("Monday");
        else if (day == 2) System.out.println("Tuesday");
        else if (day == 3) System.out.println("Wednesday");
        else if (day == 4) System.out.println("Thursday");
        else if (day == 5) System.out.println("Friday");
        else if (day == 6) System.out.println("Saturday");
        else if (day == 7) System.out.println("Sunday");
        else System.out.println("Invalid day according to question");
    }
}
