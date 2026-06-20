// EmployeeDemo.java

import java.util.Scanner;

class Employee {
    int id;
    String name;
    int age;
    double basicSalary;
    double grossSalary;

    public Employee(int id, String name, int age, double basicSalary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.basicSalary = basicSalary;
        this.grossSalary = calculateGrossSalary();
    }

    private double calculateGrossSalary() {
        double da = 0.5 * basicSalary;   // 50% of basic
        double hra = 0.2 * basicSalary;  // 20% of basic
        return basicSalary + da + hra;
    }

    public void display() {
        System.out.printf("%-5d %-15s %-5d %-12.2f %-12.2f%n",
                id, name, age, basicSalary, grossSalary);
    }
}

public class Lab4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employees no: ");
        int n = sc.nextInt();
        sc.nextLine();
        Employee[] employees = new Employee[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details f " + (i + 1) + ":");
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            System.out.print("Enter Basic Salary: ");
            double basicSalary = sc.nextDouble();
            employees[i] = new Employee(id, name, age, basicSalary);
        }
        System.out.println("\n------------------------------------------------------------");
        System.out.printf("%-5s %-15s %-5s %-12s %-12s%n",
                "ID", "Name", "Age", "Basic Salary", "Gross Salary");
        System.out.println("------------------------------------------------------------");
        for (Employee emp : employees) {
            emp.display();
        }
        System.out.println("------------------------------------------------------------");
        sc.close();
    }
}


