import java.util.Scanner;

public class Labfibo {
    public static void fib(int limit) {
        int a = 0, b = 1;
        System.out.print(a + " ");
        if (b <= limit) System.out.print(b + " ");
        while (true) {
            int c = a + b;
            if (c > limit) break;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            int n = Integer.parseInt(args[0]);// to convert arguments input to number because args input store in string
            System.out.println("Fibonacci cmd:");
            fib(n);
        } else {
            System.out.println("Cmd arg missing");
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit: ");
        int n2 = sc.nextInt();
        System.out.println("Fibonacci run:");
        fib(n2);
        sc.close();
    }
}