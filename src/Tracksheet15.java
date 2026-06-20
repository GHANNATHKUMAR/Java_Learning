import java.util.Scanner;

public class Tracksheet15 {
    public static void main(String[] args) {
        //Accept an integer and check whether it is an even number or odd.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("It is an even number");
        } else {
            System.out.println("odd number");
        }
    }
}
