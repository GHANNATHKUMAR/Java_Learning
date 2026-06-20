import java.util.Scanner;

public class Tracksheet245 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Binary Search on descending sorted arrayBinary Search on descending sorted array
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        System.out.println("Enter the Decresing sorted array ");
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter your target");
        int target = sc.nextInt();
        int start = 0;
        int end = arr.length - 1;
        int mid = start + ((end - start) / 2);
        while (start <= end) {
            if (arr[mid] == target) {
                System.out.println(mid);
                break;
            } else if (target > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = start + ((end - start) / 2);
        }
        System.out.println(mid);
    }

}
