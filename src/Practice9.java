import java.util.Scanner;

public class Practice9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n) {
            case 1: {
                System.out.println("hello world");
            }

            case 2: {
                System.out.println("namaste");
            }
            case 3: {
                System.out.println("pickachu");
            }
            case 4: {
                System.out.println("vaddakam");
            }
            case 5: {
                System.out.println("hi");
            }
            default: {
                System.out.println("hello  ");
            }
        }
    }

}
