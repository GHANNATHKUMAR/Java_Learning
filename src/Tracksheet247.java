import java.util.Scanner;

public class Tracksheet247 {
    //Guess number higher or lower

    ///  Note it will be in decreasing sorted array thats why think about it for  binary search lagaya due to sorted array to find a target
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int compugen = (int) (Math.random() * n + 1);
        int start = 1;
        int end = n;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (compugen == mid) {
                System.out.println("okay find number is " + mid);
                break;
            } else if (compugen > mid) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

    }
}
