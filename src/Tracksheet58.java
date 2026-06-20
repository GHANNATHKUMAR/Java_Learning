import java.util.Scanner;

public class Tracksheet58 {
    //Take n integer inputs from user and store them in an array.
    // Now, copy all the elements into another array in reverse order and print it.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = sc.nextInt();
        }
        int arr1[] = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            arr1[i] = arr[i];
        }
        for (int i = 0; i <= n / 2; i++) {
            int temp = arr[i];
            arr1[i] = arr1[n - 1 - i];
            arr1[n - 1 - i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
// For better solution see Tracksheet58_1
