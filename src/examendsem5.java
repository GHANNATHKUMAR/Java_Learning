class Animal1 {
    void bark() {
        System.out.println("hello barking of animal ");
    }
}

class Dog1 extends Animal1 {
    void bark() {
        System.out.println("Hello barking of dog ");
        super.bark();
    }
}

public class examendsem5 {
    public static void main(String[] args) {
        Dog1 obj1 = new Dog1();
        obj1.bark();
    }
}

