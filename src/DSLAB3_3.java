import java.util.Scanner;

//3.3  Decimal to Binary Recursion Variants
public class DSLAB3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        int arr[] = new int[20];
        int quot;
        int rem;
        int i = 0;
        while (a != 1) {
            quot = a / 2;
            rem = a % 2;
            arr[i] = rem;
            i++;
            a = quot;
        }
        arr[i] = 1;
        int n = i;
        for (int j = 0; j <= i / 2; j++) {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i--;
        }
        for (int j = 0; j <= n; j++) {
            System.out.println(arr[j]);
        }
    }
}
