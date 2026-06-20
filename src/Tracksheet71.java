import java.util.Arrays;
import java.util.Scanner;

public class Tracksheet71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Given a sorted array of distinct elements,
        // find the summation of absolute differences of all pairs in the given array.
        // (Ex: arr[] = {1, 2, 3, 4}, Output: 10)
        // Note (1,2),(1,3)
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {// Time complexity is O(n^2)
                sum = sum + Math.abs(arr[i] - arr[j]);
            }
        }
        System.out.println(sum);
    }
}
// with order of O(n) you can see below
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class SumOfAbsDiff {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // Input array size
//        System.out.print("Enter size of array: ");
//        int n = sc.nextInt();
//
//        int[] arr = new int[n];
//        System.out.println("Enter array elements:");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        // Sort the array
//        Arrays.sort(arr);
//
//        long sum = 0;
//        long prefixSum = 0;
//
//        // Apply formula
//        for (int i = 0; i < n; i++) {
//            sum += (long) arr[i] * i - prefixSum;
//            prefixSum += arr[i];
//        }
//
//        System.out.println("Sum of absolute differences: " + sum);
//        sc.close();
//    }
//}
//Step 1: Problem normal way

//Example:
//
//arr = [1, 2, 3, 4]
//
//Pairs:
//
//        (1,2)=1 , (1,3)=2 , (1,4)=3
//        (2,3)=1 , (2,4)=2
//        (3,4)=1
//Sum = 10
//
//
//        ---
//
//Step 2: Sorting
//
//Sorted array (already sorted in this case):
//
//        [1, 2, 3, 4]
//
//
//        ---
//
//Step 3: Formula thinking
//
//Suppose we are at index i in sorted array.
//
//When we take all previous elements (index < i),
//
//\text{Sum of differences} = (a[i] - a[0]) + (a[i] - a[1]) + ... + (a[i] - a[i-1])
//
//This can be written as:
//
//        = i \times a[i] - \text{sum of all previous elements}
//
//
//---
//
//Step 4: Prefix Sum
//
//We keep track of:
//
//prefixSum = sum of all elements before index i
//
//
//At each step:
//
//sum += (arr[i] * i) - prefixSum
//prefixSum += arr[i]
//
//
//        ---
//
//Step 5: Dry run
//
//arr = [1, 2, 3, 4]
//
//i	arr[i]	i * arr[i]	prefixSum	add to sum
//
//0	1	0	0	0
//        1	2	2	1	2-1 = 1
//        2	3	6	3	6-3 = 3
//        3	4	12	6	12-6 = 6
//
//
//Final total = 1 + 3 + 6 = 10 ✅
//
//
//        ---
//
//So basically:
//
//Sorted hone se |a[i] - a[j]| = a[i] - a[j] (when i > j)
//
//Har element ka contribution previous elements ke saath calculate karte hain using prefix sum
//
//Isse har pair sirf ek hi baar count hota hai