class hi {
    int l;
    int b;
    int h;

}

public class Midsem10 {
    public static void main(String[] args) {
        hi a = new hi();
        hi b = new hi();
        a.l = 1;
        a.b = 2;
        a.h = 3;
        b = a;
        System.out.println(b.b);
        b.h = 5;
        System.out.println(a.h);
    }
}
