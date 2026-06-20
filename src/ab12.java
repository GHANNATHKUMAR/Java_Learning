public class ab12 {
    static class FactorialExample {
        // Method to calculate factorial
        int factorial(int n) {
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            return fact;
        }

        public static void main(String[] args) {
            FactorialExample obj = new FactorialExample();

            int num = 5;  // example number
            int result = obj.factorial(num);

            System.out.println("Factorial of " + num + " is: " + result);
        }
    }
}
