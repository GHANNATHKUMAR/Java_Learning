import java.util.Scanner;

public class Tracksheet16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Accept name and age from the user. Check if the user is a valid voter or not. (Valid -
        // Hello Shery, You are a valid voter. Invalid - Sorry Shery, you can't cast the vote.
        // Part 2 - Print after how many years the user will be eligible)
        System.out.println("Please enter your name");
        String name = sc.nextLine();
        System.out.println("Please enter your age ");
        int age = sc.nextInt();
        if (age >= 18) System.out.println("Hello " + name + ", You are a valid voter. ");
        else {
            System.out.println("Invalid - sorry " + name + ", you can't cast the vote");
            System.out.println("You will be eligible after " + (18 - age) + "years");
        }

    }
}
