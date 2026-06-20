import java.util.Scanner;

public class Tracksheet11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Find circumference and area of circle
        double rad = sc.nextDouble();
        System.out.println("The circumference of circle is " + (2 * Math.PI * rad) + " and area of circle is" + (Math.PI * rad * rad));
    }
}
