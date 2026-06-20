import java.util.Scanner;

public class Tracksheet75 {
    //Given an array of even size, task is to find minimum value that can be added to an element
    // so that the array becomes balanced.
    // An array is balanced if the sum of the left half of the array elements is equal to the sum of the right half.
    // (Ex: Input : 1 2 1 2 1 3, Output : 2)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter your array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int leftsum = 0;
        int rightsum = 0;
        if (size % 2 == 0) {
            for (int i = 0; i < arr.length / 2; i++) {
                leftsum = leftsum + arr[i];
            }
            for (int i = arr.length / 2; i < arr.length; i++) {
                rightsum = rightsum + arr[i];
            }
        }
        int balanceval = Math.abs(leftsum - rightsum);
        System.out.println(balanceval);
    }
}
