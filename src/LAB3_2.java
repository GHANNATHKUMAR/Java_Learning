import java.util.Scanner;

public class LAB3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("1");
        } else if (n > 0) {
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            System.out.println(fact);
        } else {
            System.out.println("Cannot find");
        }
    }
}

