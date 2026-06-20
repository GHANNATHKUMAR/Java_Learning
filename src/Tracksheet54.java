import java.util.Scanner;

public class Tracksheet54 {
    //Accept size n from user and create an n size array then take n inputs into it and finally print the sum & average of all elements.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
