import org.w3c.dom.ls.LSOutput;

class Test {
    static int x = 10;

    static void modify() {
        x += 5;
    }
}

public class Midsem13 {
    public static void main(String[] args) {
        int a = 8;
        int b = 2;
        int c = 2;
        System.out.println(a++ / b / c);
        Test obj1 = new Test();
        Test obj2 = new Test();
        obj1.modify();
        System.out.println(obj2.x);
        int d = 5;
        System.out.println(d++ + ++d);
        int e = 4;
        System.out.println(e++ * --e + ++e - e--);
        System.out.println(String.valueOf("10"));
        String str = null;
        System.out.println(str.valueOf(10));
        String str1 = "  java ";
        str1.trim();
        System.out.println(str1);
    }
}

