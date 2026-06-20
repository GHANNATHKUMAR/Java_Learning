import java.util.Scanner;

public class Tracksheet62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Linear Search an array - If element found print the index, else -1
        int arr[] = {30, 4, 50, 56, 98, 12};
        int target = sc.nextInt();
        int index = -1;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Element found at " + index + " index");
        }
    }
}
