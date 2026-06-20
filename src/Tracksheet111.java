import java.util.Scanner;

public class Tracksheet111 {
    public static void main(String[] args) {
        //Accept a string and print the frequency of each character present in the string
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        int arr[] = new int[128];
        for (int i = 0; i < first.length(); i++) {
            arr[first.charAt(i)] = arr[first.charAt(i)] + 1;
        }
        int n = first.length();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.println("the frequency of " + (char) i + "->" + arr[i]);
            }
            n--;
        }

    }
}
