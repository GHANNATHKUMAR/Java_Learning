import java.util.Scanner;

public class Tracksheet112 {
    public static void main(String[] args) {
        //Check Two Strings are Anagram or Not (Anagrams words have the same word length & same character count. Examples of anagram words are arc and car, state and taste, night and thing etc.)
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();
        int arr[] = new int[128];
        boolean isanagram = true;
        if (first.length() != second.length()) {
            System.out.println("not an anagram");
        } else {
            for (int i = 0; i < first.length(); i++) {
                arr[first.charAt(i)] = arr[first.charAt(i)] + 1;
                arr[second.charAt(i)] = arr[second.charAt(i)] - 1;
            }

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    System.out.println("not an anagram");
                    isanagram = false;
                    break;
                }
            }

        }
        if (isanagram) {
            System.out.println("yes both input strings are anagram");
        }

    }
}
