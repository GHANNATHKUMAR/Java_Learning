import java.util.Scanner;

public class Tracksheet102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Accept a string and print it in reverse order
        String s = "Sheryians coding school";
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }
}
