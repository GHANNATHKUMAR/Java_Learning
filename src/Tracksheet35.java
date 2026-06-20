import java.util.Scanner;

//Sum of digits of a number (Ex: 936 = 18)
public class Tracksheet35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit;
        int sum = 0;
        while (n > 0) {
            digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
