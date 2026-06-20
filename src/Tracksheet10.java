import java.util.Scanner;

public class Tracksheet10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Find surface area of sphere
        System.out.println("Please enter your radius");
        float rad = sc.nextFloat();
        System.out.println("Your area of sphere is " + (4 * Math.PI * rad * rad));
    }
}
