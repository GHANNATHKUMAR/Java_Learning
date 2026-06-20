import java.util.Scanner;

//Question 22 using Switch (Check Consonant or Vowel using Switch)
public class Tracksheet43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0);
        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U': { // IN JAVA IT IS VALID LIKE THIS IN LINE 8
                System.out.println("Vowel");
                break;
            }
            default:
                if (Character.isLetter(ch)) {
                    System.out.println(ch + " is a consonant.");
                } else {
                    System.out.println(ch + " is not a letter.");
                }

        }
    }
}
