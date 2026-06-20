import java.util.Scanner;

public class Tracksheet12 {
    //Accept two numbers and print the greatest between them
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number");
        int a = sc.nextInt();
        System.out.println("Enter your second number");
        int b = sc.nextInt();
        // you can use function for max but use concept
        if (a > b) {
            System.out.println("a is largest");
        } else System.out.println("b is largest");
    }
}
