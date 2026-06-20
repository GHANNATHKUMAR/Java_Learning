import java.util.Scanner;

public class Tracksheet9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Accept the three sides of triangle and calculate the area using Heron's formula
        System.out.println("PLease enter your three sides of traingle");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double s = (a + b + c) / 2;
        System.out.println(("The value of s is " + s));
        double d = Math.sqrt((s * (s - a) * (s - b) * (s - c)));
        System.out.println("The value of area of required triangle is " + d);

    }
}
