import java.util.Scanner;

public class Tracksheet13 {
    public static void main(String[] args) {
        //Accept the gender from the user as char and print the respective greeting message (Ex - Good Morning Sir (on the basis of gender))
        Scanner sc = new Scanner(System.in);
        System.out.println("Plese enter your gender");
        char ch = sc.next().charAt(0);
        if (ch == 'M' || ch == 'm') {
            System.out.println("Good morning sir");
        } else if (ch == 'F' || ch == 'f') {
            System.out.println("Good morning mam");
        } else {
            System.out.println("Invalid input");
        }
    }
}
