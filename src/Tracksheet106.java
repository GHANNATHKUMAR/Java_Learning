import java.util.Scanner;

public class Tracksheet106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Toggle each alphabet of String (In - AcgDfD Output - aCGdFd)
        String first = sc.nextLine();
        String result = "";
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) >= 'A' && first.charAt(i) <= 'Z') {
                result = result + ((char) (first.charAt(i) + 32));
            } else if (first.charAt(i) >= 'a' && first.charAt(i) <= 'z') {
                result = result + ((char) (first.charAt(i) - 32));
            }
        }
        System.out.println(result);
    }
}
