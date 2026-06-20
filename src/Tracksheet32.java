import java.util.Scanner;

public class Tracksheet32 {
    //Check if the number is Prime or not.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime;
        if (n <= 1) {
            System.out.println("No prime");
        } else if (n == 2) {
            System.out.println("Prime number");
        } else if (n % 2 == 0) {
            System.out.println("no prime");
        } else {
            isPrime = true;
            for (int i = 3; i <= (int) Math.sqrt(n); i += 2) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
    }
}
