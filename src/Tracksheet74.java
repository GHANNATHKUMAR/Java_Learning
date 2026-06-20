import java.util.Arrays;
import java.util.Scanner;

public class Tracksheet74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // We are given an array of Integers.
        // We have to perform the following operation on the array until it is fully exhausted:
        // Select the max number in the array and delete that
        // number including all the numbers to its right side in the array.
        // Repeat this step for the left elements of the array
        // /i.e //select the maximum element in the left elements and delete it including all numbers to its right.
        // Our task is to simulate the above procedure
        // and return the number of steps that will be taken
        // until the first element (index 0) of the array is also deleted and
        // the array is exhausted. (Ex: Array = [2, 3, 5, 4, 1], Output : Steps Taken: 3)
        System.out.println("Enter size");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int n = arr.length;
        System.out.println(Arrays.toString(arr));
        // bas step ginnna hai
        int step = 0;
        int index = -1;
        while (index != 0) {
            int max = Integer.MIN_VALUE;
            index = -1;
            for (int i = 0; i < n; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                    index = i;
                }
            }
            n = index;
            step++;
        }
        System.out.println(step);
    }
}
