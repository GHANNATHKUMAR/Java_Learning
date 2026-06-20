class Example2 {
    static int count = 0; // static variable

    Example2() {
        count++;
    }


}

public class Midsem11 {
    public static void main(String[] args) {
        Example2 a = new Example2();
        System.out.println(a.count);


    }
}

