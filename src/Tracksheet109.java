import java.util.Scanner;

public class Tracksheet109 {
    //Extend the previous question and capitalize the first & last character of each word in the sentence and print the new sentence (Ex - Hello bhai Kaise ho a, Output - HellO BhaI KaisE HO A)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String arr[] = name.split(" ");
        String gh = "";
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length(); j++) {
                if (j == 0 || j == arr[i].length() - 1) {
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
        System.out.println(gh);
    }
}
