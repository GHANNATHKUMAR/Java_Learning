import java.util.Scanner;

public class Practice13 {
    /* size 3
    array 0 4
    B 4
    answer should be 8
     */
    /*
    all possible cases taken here after debugging
    array 1,4,4
    B 4
    answer should be 7
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of A");
        int n = sc.nextInt();
        int A[] = new int[n];
        int B = 0;
        int totaldur = 0; // where totaldur is total durationb the streetlight remains on
        boolean constr = true;
        if (n >= 1 && n <= Math.pow(10, 5)) {
            System.out.println("Enter your array");
            for (int i = 0; i < n; i++) {
                int p = sc.nextInt();
                if (p >= 0) {
                    A[i] = p;
                } else {
                    constr = false;
                    break;
                }
            }
        } else {
            System.out.println("NOT POSSIBLE");
        }
        boolean constr2 = true;
        if (constr == true) {
            System.out.println("Enter B");
            int x = sc.nextInt();
            if (x <= Math.pow(10, 9)) {
                B = x;
            } else {
                constr2 = false;
                System.out.println("constraints 2 false");
            }
        } else {
            System.out.println("constraints not satisfied");
        }
        boolean issort = true;
        boolean constr3 = true;
        if (constr2 == true) {
            for (int i = 0; i < A.length - 1; i++) {
                if (A[i + 1] < A[i]) {
                    issort = false;
                    System.out.println("constrain 3 not satisfied ");
                    constr3 = false;
                    break;
                }

            }
        } else {
            System.out.println("constr 2  not satisfied ");
        }
        if (constr == true) {
            for (int i = 0; i <= A.length - 1; i++) {
                if (i < A.length - 1) {
                    if (A[0] == 0) {
                        totaldur = totaldur + B;
                    } else if (A[i + 1] - A[i] == 0) {
                        totaldur = totaldur + 0;
                    } else if (A[i + 1] - A[i] <= (B - 1)) {
                        totaldur = totaldur + A[i + 1] - A[i];
                    } else {
                        totaldur = totaldur + B;
                    }
                } else {
                    totaldur = totaldur + B;
                }
            }
            System.out.println(totaldur);
        } else {
            System.out.println("Constrain  not satisfied");
        }
    }
}
