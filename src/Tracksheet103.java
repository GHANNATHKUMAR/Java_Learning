import java.util.Scanner;

public class Tracksheet103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Check if the string is Palindromic or not
        String s = sc.nextLine();
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            rev = rev + ch;
        }
        if (s.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}
