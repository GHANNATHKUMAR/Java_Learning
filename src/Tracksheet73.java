import java.util.Arrays;
import java.util.Scanner;

public class Tracksheet73 {
    public static void main(String[] args) {
        //Given an array of integers, update every element with
        // the multiplication of previous and next elements with the following exceptions:
        //  a) The First element is replaced by the multiplication of the first and second.
        // b) The last element is replaced by multiplication of the last and second last.
        // (Ex: Input : arr[] = {2, 3, 4, 5, 6}, Output : arr[] = {6, 8, 15, 24, 30})
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        if (size > 1) {
            int prev = arr[0];
            arr[0] = arr[0] * arr[1];
            for (int i = 1; i < arr.length - 1; i++) {
                int curr = arr[i];
                arr[i] = prev * arr[i + 1];
                prev = curr;
            }
            arr[arr.length - 1] = arr[arr.length - 1] * prev;
        }

        System.out.println(Arrays.toString(arr));
    }
}
