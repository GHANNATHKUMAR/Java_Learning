import java.util.Scanner;

public class Tracksheet8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double P = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();
        double amount = P * Math.pow((1 + r / 100), t); // including interest
        double CI = amount - P;
        System.out.println("The value of CI " + CI);
    }
}
