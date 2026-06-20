import java.util.Scanner;

public class Tracksheet4 {
    // Accept the User's name, age and print in following manner (Ex - Hello Shery, you are 12 years old.)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please  enter your name");
        String name = sc.nextLine();
        System.out.println("Please enter your age");
        int age = sc.nextInt();
        System.out.println("Hello" + name + ", you are " + age + "years old");
    }
}
