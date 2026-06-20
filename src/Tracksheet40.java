import java.util.Scanner;

public class Tracksheet40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Print \hello\" until user gives wrong input using do while"
        int n;
        do {
            System.out.println("type positive number to continue otherwise type negative number ");
            n = sc.nextInt();
            if (n > 0) {
                System.out.println("hello");
            } else {
                System.out.println("program ended");
            }
        } while (n > 0);
    }
}
