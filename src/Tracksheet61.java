import java.util.Arrays;
import java.util.Scanner;

public class Tracksheet61 {
    //Array Reverse Without Using Extra space
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // withpout using extra space means without creating new array or using new array
        int arr[] = {10, 20, 30, 40, 4};
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
        // it is called two pointer reverse algorithm
    }
}
