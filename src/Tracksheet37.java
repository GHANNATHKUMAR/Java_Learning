import java.util.Scanner;

public class Tracksheet37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Accept a number and check if it is a palindromic number
        // (If number and its reverse are equal, Ex: 12321 - Reverse - 12321)

        int n = sc.nextInt();
        int sum = 0;
        int digit;
        int copy = n;
        while (n > 0) {
            digit = n % 10;
            sum = sum * 10 + digit;
            n = n / 10;
        }
        if (sum == copy) {
            System.out.println("Given number is palindromic number");
        } else {
            System.out.println("Not palindromic number ");
        }
    }
}
