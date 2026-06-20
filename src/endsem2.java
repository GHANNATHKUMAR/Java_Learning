public class endsem2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 6;
        try {
            b = a / b;
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
