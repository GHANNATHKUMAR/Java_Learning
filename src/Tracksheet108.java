import java.util.Scanner;

public class Tracksheet108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Accept a space separated sentence and split it into words. Print each word on a new line with the first letter capitalized. (IN- Hello bhai kaise ho, OP- Hello, Bhai, Kaise, Ho)
        String name = sc.nextLine();
        String arr[] = name.split(" ");
        String gh = "";
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length(); j++) {
                if (j == 0) {
                    if (arr[i].charAt(j) >= 'a' && arr[i].charAt(j) <= 'z')
                        gh = gh + ((char) (arr[i].charAt(j) - 32));
                    else {
                        gh = gh + arr[i].charAt(j);
                    }
                } else {
                    gh = gh + arr[i].charAt(j);
                }
            }
            gh = gh + " ";
        }
        String arr1[] = gh.split(" ");
        for (int j = 0; j < arr1.length; j++) {
            System.out.println(arr1[j] + ",");
        }
    }
}
