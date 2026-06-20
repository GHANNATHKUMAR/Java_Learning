class Animal3 {
    void eat() {
        System.out.println("hello animal eat");
    }

    void hello() {
        System.out.println("hello for parent");
    }
}

class Dog3 extends Animal3 {
    void eat() {
        System.out.println("hello dog eat");
    }

    void eatfordog() {
        System.out.println("hello dog it is special eat for you");
    }
}

public class examendsem6 {
    public static void main(String[] args) {
        Dog3 obj = new Dog3();
        obj.eat();
        obj.eatfordog();
        obj.hello();
        Animal3 obj1 = new Dog3();
        obj1.hello(); //done
        obj1.eat();
        // here dikkat obj1.eatfordog();
        Dog3 dog = (Dog3) obj1;
        dog.eatfordog();

    }
}
