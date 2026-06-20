import java.util.Scanner;

public class Tracksheet63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Binary Search. If element found print the index, else -1 // please this code is written for increasing sort array
        System.out.println("Enter size");
        int size = sc.nextInt();
        System.out.println("Enter your target");
        int target = sc.nextInt();
        System.out.println("Enter your Array");
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int start = 0;
        int end = arr.length - 1;
        int index = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                index = mid;
                break;

            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = start - 1;
            }
        }
        if (index != -1) {
            System.out.println("target is found at the index " + index);
        } else {
            System.out.println("index came " + index + " means your given target is not found in array ");
        }
    }
}
