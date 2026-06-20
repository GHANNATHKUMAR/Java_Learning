public class Lab10_2 {
    public static void main(String[] args) {
        String[] numbers = {"10", "5", "0", "abc", null};
        int fixedNumber = 100;
        System.out.println("Starting data processing...");
        for (String value : numbers) {
            try {
                int num = Integer.parseInt(value);
                int result = fixedNumber / num;
                System.out.println("100 / " + num + " = " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero is not allowed.");
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid number format -> '" + value + "'");
            } catch (NullPointerException e) {
                System.out.println("Error: Null value is in the array.");
            } finally {
                System.out.println("Processed complete for this entry.");
            }
        }
        System.out.println(" Processing completed for all entries.");
    }
}
