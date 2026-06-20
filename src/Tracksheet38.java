import java.util.Scanner;

public class Tracksheet38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Accept a number and check if it is a strong number or not (Sum of factorial of each digit,
        // Ex: 145 = 1! + 4! + 5! = 145)
        System.out.println("Enter your number");
        int n = sc.nextInt();
        int sum = 0;
        int digit;
        int fact;
        int copy = n;
        while (n > 0) {
            digit = n % 10;
            fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
            n = n / 10;
        }
        if (copy == sum) {
            System.out.println("Given number is an strong number");
        } else {
            System.out.println("Not strong number");
        }
    }
}
