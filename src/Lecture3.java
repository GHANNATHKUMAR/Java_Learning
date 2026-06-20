import java.util.Scanner;

public class Lecture3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your gender");
        char ch = sc.nextLine().charAt(0);
        int salary = 0;
        if (ch == 'M') {
            System.out.println("Please enter your year service");
            int yrser = sc.nextInt();
            if (yrser >= 10) {
                System.out.println("Please enter your qualifications");
                String qly = sc.next();
                if (qly.equals("P-G")) {
                    salary = 15000;
                } else {
                    salary = 10000;
                }
                System.out.println("your salary is " + salary);
            } else {
                System.out.println("Please Enter your qualifications");
                String qly = sc.next();
                if (qly.equals("P-G")) {
                    salary = 10000;
                } else {
                    salary = 7000;
                }
                System.out.println("your salary is " + salary);
            }

        } else {
            System.out.println("Please enter your year service");
            int yrser = sc.nextInt();
            if (yrser >= 10) {
                System.out.println("Please enter your qualifications");
                String qly = sc.next();
                if (qly == "P-G") {
                    salary = 12000;
                } else {
                    salary = 9000;
                }
                System.out.println("your salary is " + salary);
            } else {
                System.out.println("Please Enter your qualifications");
                String qly = sc.next();
                if (qly == "P-G") {
                    salary = 10000;
                } else {
                    salary = 6000;
                }
                System.out.println("your salary is " + salary);
            }
        }
    }
}

