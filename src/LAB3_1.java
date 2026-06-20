import java.util.Scanner;

public class LAB3_1 {
    public static void triples(int n) {
        boolean found = false;
        for (int a = 1; a <= n; a++) {
            for (int b = a; b <= n; b++) {
                for (int c = b; c <= n; c++) {
                    if (a * a + b * b == c * c) {
                        System.out.println(a + " " + b + " " + c);
                        found = true;
                    }
                }
            }
        }
        if (!found) {
            System.out.println("No triples found");
        }
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            int n = Integer.parseInt(args[0]);
            System.out.println("Triples (command line):");
            triples(n);
        } else {
            System.out.println("Command line argument missing");
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n2 = sc.nextInt();
        System.out.println("Triples (runtime):");
        triples(n2);
        sc.close();
    }
}



