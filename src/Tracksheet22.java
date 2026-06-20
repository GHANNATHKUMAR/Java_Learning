import java.util.Scanner;

public class Tracksheet22 {
    //Accept an English alphabet from user and check if it is a consonant or a vowel.
    // to solve these question are two methods one if else another switch method , switch method will be better
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("GIVEN character is vowel");
        } else {
            System.out.println("Given character is consonaant");
        }
    }

}
