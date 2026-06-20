import java.util.*;

class person {
    String name;
    int age;

    person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class employee3 extends person {
    int salary;

    employee3(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }
}

class Manager extends employee3 {
    String department;

    Manager(String name, int age, int salary, String department) {
        super(name, age, salary);
        this.department = department;
    }

    void displayDetails() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
        System.out.println(department);
    }

}

public class Lab8_3 {
    public static void main(String[] args) {
        Manager first = new Manager("Ghannath", 22, 800000, "COMPUTER SCIENCE AND ENGINERRING");
        first.displayDetails();
    }
}
