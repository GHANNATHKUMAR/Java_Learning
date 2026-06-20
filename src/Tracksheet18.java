import java.util.Scanner;

public class Tracksheet18 {
    //Accept three numbers and print the greatest among them
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b) {
            if (a > c) System.out.println("a is greatest");
            else System.out.println("c is greatest");
        } else if (b > c) {
            if (b > a) System.out.println("b is greatest");
            else System.out.println("a is greatest ");

        } else {
            System.out.println("c is greatest");
        }
    }
}
