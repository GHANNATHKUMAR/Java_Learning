import java.util.Scanner;

//Find the // second greatest //element (Ex: {2, 96, 69, 77, 145, 20} =// Second greatest element = 96)
public class Tracksheet56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {23, 67, 87, 12, 87, 45};
        int max = Math.max(arr[0], arr[1]);
        int secmax = Math.min(arr[0], arr[1]);
        for (int i = 2; i <= arr.length - 2; i++) {
            if (arr[i] > max) {
                secmax = max;
                max = arr[i];

            } else if (arr[i] > secmax && arr[i] != max) {
                secmax = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(secmax);
    }
}
