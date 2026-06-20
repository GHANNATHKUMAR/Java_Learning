
//Find sum of minimum absolute difference of the given array

public class Tracksheet77 {

    static int sumOfMinAbsDifferences(int arr[], int n) {

        int result = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += Math.abs(arr[i] - arr[j]);
            }

            result = Math.min(sum, result);
        }

        return result;
    }

    // Driver code
    public static void main(String args[]) {
        int arr[] = {2, 4, 5, 3};
        int n = arr.length;
        System.out.println("Required Minimum Sum is " + sumOfMinAbsDifferences(arr, n));
    }
} // minimum absolute difference in array means that harek element mein se sare element ghata te jao uska absolute value add karte jao phir dekho usmein kis element ke respect mein sum sabse kam hai
