public class Midsemp4 {
    static int a;

    static int solve(int n) {
        if (n == 1) return 1;
        a = solve(n - 1);
        return a;
    }

    public static void main(String[] args) {
        int b = solve(5);
        System.out.println(b);
    }
}