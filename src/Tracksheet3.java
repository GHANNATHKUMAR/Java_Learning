import java.util.Scanner;

public class Tracksheet3 {
    // Accept two integers from user and print the sum (Ex - The sum of 45 & 12 = 57)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("The sum of " + a + "and" + b + "=" + c);

    }
}
