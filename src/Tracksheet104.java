import java.util.Scanner;

public class Tracksheet104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Palindromic String using method and Two pointer algorithm (hint: Array reverse algo)
        String s = sc.nextLine();
        int i = 0, j = s.length() - 1;
        boolean pal = true;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                System.out.println("not palindrome");
                pal = false;
                break;
            }
            i++;
            j--;
        }
        if (pal == true) {
            System.out.println("palindrome");
        }
    }
}
