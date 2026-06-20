import java.util.Scanner;

public class Lab4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomInt = (int) (Math.random() * 100);
        System.out.println("Enter number: ");
        int a = sc.nextInt();
        while (true) {
            if (randomInt == a) {
                System.out.println("correct");
                break;
            }
            if (randomInt > a) {
                System.out.println("it is too low");
            } else if (randomInt < a) {
                System.out.println("it is too high");
            }
        }

    }
}
