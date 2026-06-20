import java.util.Scanner;

public class Tracksheet72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //You are given two arrays of **equal length**: An **integer array** A[]
        // and a **character array** B[], where each character is one of 'a', 'b', or 'c'.
        // Find the **minimum** value of the expression:
        // min(sum of values linked with 'a' + sum of values linked with 'b', sum of values linked with 'c').
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        char arr1[] = new char[size];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.next().charAt(0);

        }
        int suma = 0, sumb = 0, sumc = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr1[i] == 'a') {
                suma = suma + arr[i];
            } else if (arr[i] == 'b') {
                sumb = sumb + arr[i];
            } else {
                sumc = sumc + arr[i];
            }
        }
        int ans = Math.min(suma + sumb, sumc);
        System.out.println(ans);
    }
}
