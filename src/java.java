import java.util.Arrays;

public class java {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            int arr[] = new int[5];
            if (i == 1) {
                arr[0] = 1;
                arr[2] = 3;
            } else {
                arr[2] = 3;
            }
            System.out.println(Arrays.toString(arr));
            String b = "hello";

        }
    }
}
