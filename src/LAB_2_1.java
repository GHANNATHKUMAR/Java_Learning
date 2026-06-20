import java.util.Scanner;

public class LAB_2_1 {
    public static int factorial(int a) {
        int n = a;
        if (n == 0) {
            return 1;
        } else if (a > 0) {
            int fact = n * factorial(n - 1);
            return fact;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = factorial(n);
        if (result != -1) {
            System.out.println("factorial of number is " + result);
        }
    }
}
