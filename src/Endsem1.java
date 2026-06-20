class student1 {
    int rno;
    String name;
    int marks;

    student1(student1 other) { // constructors
        name = this.name;
        this.rno = other.rno;
        this.marks = marks;
    }

    student1() { // method
        this.rno = 13;
        this.name = "ghannath yadav";
        this.marks = 15;
    }

    //constructor overloading ek feature hai Java mein jisme tum multiple constructors bana sakte ho ek hi class ke andar,
    // lekin har constructor ka signature alag hona chahiye (number of parameters or types of parameters).
    student1(int roll, String name, int marks) { // method
        this.rno = roll;
        this.name = name;
        this.marks = marks;
    }

    void printgreeting() {
        System.out.println("Hello doston thanks for calling me ");
    }
}

public class Endsem1 {
    public static void main(String[] args) {
        student1 random = new student1(15, "ghannath", 78);
        student1 ghannath = new student1(random);
        ghannath.printgreeting();
        System.out.println(random.marks);
        System.out.println(ghannath.marks);
        System.out.println();
        ghannath.marks = 80;
        System.out.println(ghannath.marks);
        System.out.println(random.marks);
    }
}
