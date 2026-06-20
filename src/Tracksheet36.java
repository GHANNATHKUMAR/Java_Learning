import java.util.Scanner;
//Accept a number and print its reverse

public class Tracksheet36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int digit;
        while (n > 0) {
            digit = n % 10;
            sum = sum * 10 + digit;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
