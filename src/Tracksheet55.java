import java.util.Scanner;

public class Tracksheet55 {
    //Find the greatest element (Ex: {2, 96, 69, 77, 145, 20} = Max element = 145 found at 4 index)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 8, 2, 3, 6, 7, 8, 8};
        int max = arr[0];
        int index = 0; // first element jahan mil jayega usko print karwayega
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println(max + "and" + index);
    }
}
