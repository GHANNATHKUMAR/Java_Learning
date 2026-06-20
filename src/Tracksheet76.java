import java.util.Arrays;
import java.util.Scanner;

public class Tracksheet76 {
    //Sort First half in Ascending and Second half in descending order in an array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter your array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        if (size % 2 == 0) {
            for (int i = 0; i < arr.length / 2; i++) {
                for (int j = i + 1; j < arr.length / 2; j++) {
                    if (arr[j] < arr[i]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            for (int i = arr.length / 2; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] > arr[i]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
