import java.util.*;

class student {
    private String name;
    private char grade;

    // constructor
    public student(String name, char grade) {
        this.name = name;
        this.grade = grade;
    }

    // method
    public void displaInfo() {
        System.out.println(("student name-> " + this.name));
        System.out.println("Student grade-> " + this.grade);
    }
}

public class Lab6 {
    public static void main(String[] args) {
        student s1 = new student("Ghannath", 'A');
        s1.displaInfo();
    }
}
