import java.util.Scanner;

public class Tracksheet21 {
    //Bijli BIll
// from botton to top approach
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int unit = sc.nextInt();
        double amount = 0;
        if (unit > 400) {
            amount = amount + (unit - 400) * 13;
            unit = 400;
        }
        if (unit > 200 && unit <= 400) {
            amount = amount + (unit - 200) * 8;
            unit = 200;
        }
        if (unit > 100 && unit <= 200) {
            amount = amount + (unit - 100) * 6;
            unit = 100;
        }
        amount = amount + (unit * 4.2);
        System.out.println("Your amount is " + amount);
    }
}
