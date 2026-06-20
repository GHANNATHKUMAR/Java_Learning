import java.util.Scanner;

public class Tracksheet6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of first number");
        int a = sc.nextInt();
        System.out.println("Enter the value of second number");
        int b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("The value of first number now is " + a + " and  value of second number now is " + b);

    }
}
