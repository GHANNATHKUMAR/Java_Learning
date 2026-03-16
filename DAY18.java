public class DAY18 {
    // Java Recursion
    // Recursion is the technique of making a function call itself. This technique
    // provides a way to break complicated problems down into simpler problems which
    // are easier to solve.

    // Recursion may be a bit difficult to understand. The best way to figure out
    // how it works is to experiment with it.
    // Halting Condition
    // Just as loops can run into the problem of infinite looping, recursive methods
    // can run into the problem of infinite recursion. Infinite recursion is when
    // the method never stops calling itself. Every recursive method should have a
    // halting condition, which is the condition where the method stops calling
    // itself. In the previous example, the halting condition is when the parameter
    // k becomes 0.

    // It is helpful to see a variety of different examples to better understand the
    // concept. In this example, the method adds a range of numbers between a start
    // and an end. The halting condition for this recursive method is when end is
    // not greater than start:

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }

    static void countdown(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            countdown(n - 1);
        }
    }

    static int factorial(int n) {
        if (n > 1) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }

    public static void main(String args[]) {
        int result = sum(10);
        System.out.println(result);
        int result1 = sum(5, 10);
        System.out.println(result1);
        countdown(5);
        System.out.println("Factorial of 5 is " + factorial(5));
    }
}
