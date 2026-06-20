import java.util.Scanner;

public class LAB_3_4 {
    public static void main(String[] args) {
        //Task-D: Write a Java program to swap two numbers without using a third variable,
        // applying bitwise XOR operations.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // now swapping using xor opeartions
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swapping their values are " + a + " and " + b);
    }
}
