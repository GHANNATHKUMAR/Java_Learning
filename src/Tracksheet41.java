import java.util.Scanner;

public class Tracksheet41 {
    public static void main(String[] args) {
        //Make a choice based calculator using do while
        Scanner sc = new Scanner(System.in);
        char ch;
        do {
            System.out.println("+ for addition");
            System.out.println("- for addition");
            System.out.println("* for addition");
            System.out.println("/ for addition");

            ch = sc.nextLine().charAt(0);
            if (ch == '+') {
                int first = sc.nextInt();
                int second = sc.nextInt();
                System.out.println(first + second);
            } else if (ch == '-') {
                int first = sc.nextInt();
                int second = sc.nextInt();
                System.out.println(first - second);
            } else if (ch == '*') {
                int first = sc.nextInt();
                int second = sc.nextInt();
                System.out.println(first * second);
            } else if (ch == '/') {
                int first = sc.nextInt();
                int second = sc.nextInt();
                System.out.println(first / second);
            } else {
                break;
            }
            sc.nextLine(); // take where because after first loop running  ke baad jab second loop chalega
            //  tab integer ke baad  phir se character lena hai yani nextline method isisliye ek extra nextline end me lagaya
        } while (true);


    }
}
