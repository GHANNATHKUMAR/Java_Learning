import java.util.Arrays;
import java.util.Scanner;

public class Tracksheet113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Sort the words of the sentence
        String sentence = sc.nextLine();
        String parts[] = sentence.split(" ");
        for (int i = 0; i < parts.length; i++) {
            for (int j = 0; j < parts.length - 1 - i; j++) {
                if (parts[j].compareTo(parts[j + 1]) > 0) {
                    String temp = parts[j];
                    parts[j] = parts[j + 1];
                    parts[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(parts));
    }

}
