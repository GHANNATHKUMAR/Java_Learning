import java.util.Scanner;

public class Tracksheet52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //V Pattern - Min Height = 3
        int n = sc.nextInt();
        if (n >= 3) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j < 2 * n; j++) {
                    if (j == i || i + j == 2 * n) {

                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("This input is invalid");
        }

    }
}
