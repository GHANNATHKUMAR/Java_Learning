import java.util.Scanner;

//Separate each digit of a number and print it on a new line (Ex - 123 -> OP: 3, 2, 1)
public class Tracksheet34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            int digit = n % 10;
            System.out.print(digit + ", ");
            n = n / 10;
        }
    }
}
