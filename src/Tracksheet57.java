import java.util.Scanner;

public class Tracksheet57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Check if array is sorted in increasing order or not.
        int arr[] = {2, 3, 4, 5, 5, 7};
        boolean issorted = true;
        for (int i = 0; i <= arr.length - 2; i++) {
            if (arr[i + 1] < arr[i]) {
                issorted = false;
                break;
            }
        }
        if (issorted == true) {
            System.out.println("GIVEN ARRAY IS SORTED  IN INCREASING ORDER");
        } else {
            System.out.println("Not sorted in increasing order");
        }

    }
}
