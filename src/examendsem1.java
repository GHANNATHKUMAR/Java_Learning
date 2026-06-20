class a {
    int number;

    void display() {
        System.out.println("hello parent");
    }
}

class b extends a {
    int number2;

    public void show() {
        System.out.println("hello show");
    }
}

public class examendsem1 {
    public static void main(String[] args) {
        b obj = new b();
        obj.show();
        obj.display();
        a obj1 = new b();
        obj1.display();
        b obj2 = new b();
    }
}

