import java.util.Scanner;

public class Tracksheet67 {
    //Strong number using methods.
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static boolean isfact(int number) { // tum ek number daloge vahan se tumhe ek boolean value milega
        int n = number;
        int digit;
        int sum = 0;
        while (number != 0) {
            digit = number % 10;
            sum = sum + factorial(digit);
            number = number / 10;
        }
        return n == sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (isfact(number)) {
            System.out.println("success , it is strong number");
        } else {
            System.out.println("Not strong number");
        }
    }
}
