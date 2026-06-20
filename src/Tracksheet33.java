import java.util.Scanner;

public class Tracksheet33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Write a program to take two inputs a, b & find the value of a raised to the power of b.
        // (Ex - a = 2, b = 5, OP - 2^5 = 32)
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 1;
        for (int i = 1; i <= b; i++) {
            ans = ans * a;
        }
        System.out.println("answer is " + ans);
    }
}
