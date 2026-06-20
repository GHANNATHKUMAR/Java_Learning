import java.util.Scanner;

public class Tracksheet7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter your length value of your rectangle");
        int length = sc.nextInt();
        System.out.println(" Enter your length value of your rectangle");
        int breadth = sc.nextInt();
        System.out.println("The area and perimeter of your rectangle is " + (length * breadth) + " " + (2 * (length + breadth)));

    }
}
