import java.util.Scanner;

public class Tracksheet39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Automorphic number (Ex: 5 = 25 = 625 = 390625, 6=36, 76 = 5776)
        System.out.println("Enter your number");
        int n = sc.nextInt();
        int count = 0;
        int sq;
        int copy = n;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        sq = copy * copy;
        if (sq % Math.pow(10, count) == copy) System.out.println("Given number is an Automorphic Number");
        else System.out.println("Not Automorhic number");
    }
}
