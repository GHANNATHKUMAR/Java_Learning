import java.util.Scanner;

public class Tracksheet68 {
    public static boolean issimple(int number) {
//Special number using methods.
        int sum = 0;
        int product = 1;
        int n = number;
        int digit;
        int result;
        while (n != 0) {
            digit = n % 10;
            sum = sum + digit;
            product = product * digit;
            n = n / 10;
        }
        return number == (sum + product);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        if (issimple(number)) {
            System.out.println("it is special number ");
        } else System.out.println("not special number");
    }
}
