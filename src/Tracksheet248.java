import java.util.Scanner;

public class Tracksheet248 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Search Insert Position // assume sorted in increasing order // this is leetcode problem
        // for better understanding of question go to read problem link is in trackersheet
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        int start = 0;
        int end = 4;
        System.out.println("Enter target ");
        int target = sc.nextInt();
        while (start <= end) {
            int mididx = start + (end - start) / 2;
            if (target == arr[mididx]) {
                System.out.println("Index " + mididx);
                break;
            } else if (target < arr[mididx]) {
                end = mididx - 1;
            } else {
                start = mididx + 1;
            }
        }
        System.out.println("Then final element should be in array at index  " + start + "th position");
        // note array is in increasing order already taken or assumed , because take example 1,3,4,5 and assume target is 2 jab start 1 hoga aur end 0 hoga tabhi loop break hoga aur vahi satrt ka value toh hona chahiye index target 2 ka becuase vo 1 ke baad hi aana chahiye toh is example mein start last mein ho gaya 1 toh index 1 pe hona chahiye tha , question yahi puchha hai kis index pe hona chahiye thya , toh bata diya leetcode problem hai jake link se dekho
    }
}
