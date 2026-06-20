import java.util.Scanner;

public class Tracksheet29 {
    //Print the sum of all even & odd numbers in a range separately.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumev = 0;
        int sumodd = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sumev += i;
            } else {
                sumodd += i;
            }
        }
        System.out.println("The sum of even numbers is range is " + sumev + " and sum of odd  numbers in range is " + sumodd);
    }
}
