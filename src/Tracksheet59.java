import java.util.Arrays;
import java.util.Scanner;

public class Tracksheet59 {
    //Array left Rotation by 1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {20, 10, 50, 30, 70, 5};
        int temp = arr[0];
        for (int i = 0; i <= arr.length - 2; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
