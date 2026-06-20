import java.util.Scanner;

public class Tracksheet20 {
    //Shop discount
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your amount: ");
        int amount = sc.nextInt();
        double discount_per = 0;
        double discount;
        double pay_amt;
        if (amount >= 0 && amount < 5000) {
            discount_per = 0;
        } else if (amount >= 5000 && amount < 7000) {
            discount_per = 5;

        } else if (amount >= 7000 && amount <= 9000) {
            discount_per = 10;

        } else {
            discount_per = 20;

        }
        discount = (discount_per * amount) / 100;
        pay_amt = amount - discount;
        System.out.println(pay_amt);
    }
}
