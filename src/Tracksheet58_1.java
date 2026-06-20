import java.util.Arrays;
import java.util.Scanner;

public class Tracksheet58_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = sc.nextInt();
        } // note making an array with reverse element directly
        int arr1[] = new int[arr.length];
        int j = arr.length - 1;
        for (int i = 0; i <= arr.length - 1; i++) {
            arr1[i] = arr[j]; // or also arr[i++]=arr[j--] ;
            j--;
        }
        System.out.println(Arrays.toString(arr1));
    }
}
