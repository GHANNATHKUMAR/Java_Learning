import java.util.Scanner;

public class Tracksheet66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Print the count of subarrays whose sum is equal to the target.
        // (Ex - {1,2,3,7,5}, T = 12 O/P - 2 - [ {2,3,7}, {7,5} ] - Both subarrays have sum 12)
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                if (sum == 12) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
