import java.util.Scanner;

public class Tracksheet107 {
    //Take an array of strings words and a String Prefix. Print the number of strings in words that contain pref as a prefix.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr[] = {"attention", "class", "attend"};
        String prefix = "at";
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            if (word.startsWith(prefix)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
