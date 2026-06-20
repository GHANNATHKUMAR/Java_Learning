class employee {
    private int id;
    private String name;
    private double salary;

    // default constructor
    public employee() {
        this.id = 0;
        this.name = "Not assigned";
        this.salary = 0;
    }

    // two argument constructor
    public employee(int id, String name) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // three argument constructor
    public employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        if (salary < 0) {
            this.salary = salary;
        }
    }

    // method to display
    public void display() {
        System.out.println("Employee id-> " + this.id);
        System.out.println("Employee name-> " + this.name);
        System.out.println("Employee salary-> " + this.salary);
        System.out.println();
        System.out.println();
    }
}

public class lab6_1 {
    public static void main(String[] args) {
        // using default constructor
        employee e1 = new employee();
        // using two argument constructor
        employee e2 = new employee(101, "sumit");
        // using three argument constructor
        employee e3 = new employee(102, "ghannath", 15000);

        e1.display();
        e2.display();
        e3.display();
    }
}
