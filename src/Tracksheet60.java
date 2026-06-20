import java.util.Arrays;
import java.util.Scanner;

public class Tracksheet60 {
    //Array left rotation by K elements
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter k");
        int arr[] = {10, 20, 30, 40, 50};
        int k = sc.nextInt();
        k = k % arr.length;
        for (int i = 1; i <= k; i++) {
            int temp = arr[0];
            for (int j = 0; j <= arr.length - 2; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
