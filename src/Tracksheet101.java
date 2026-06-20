import java.util.Scanner;

public class Tracksheet101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Accept a string from user and print its each character on a new line
        String s = "Sheryians coding school";
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }
}
