// SWap of two numbers without third variable

import java.util.Scanner;

public class Tracksheet6_1 {
    public static void main(String[] args) {
        // Without third variable
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("The value of a is now" + a + " the value of b is now " + b);
    }
}
