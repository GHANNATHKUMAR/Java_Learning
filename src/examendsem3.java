class person1 {
    person1() {
        System.out.println("hello");
    }

    person1(int i) {
        System.out.println("hello person bhai " + i);
    }
}

class student3 extends person1 {
    student3() {
        super((10));
        System.out.println("hello student 3 bhai kaise ho");
    }
}

public class examendsem3 {
    public static void main(String[] args) {
        student3 obj = new student3();
    }
}
