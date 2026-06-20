import java.util.Scanner;

// User-defined exception
class InvalidGradeException extends Exception {
    public InvalidGradeException(String message) {
        super(message);
    }
}

public class Lab11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student's grade (A+, A, B, C, D, P, F): ");
        String grade = sc.nextLine();

        try {
            validateGrade(grade);
            System.out.println("Valid grade entered: " + grade);

        } catch (InvalidGradeException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }

    // Method to validate grade
    public static void validateGrade(String grade) throws InvalidGradeException {
        String[] validGrades = {"A+", "A", "B", "C", "D", "P", "F"};

        boolean isValid = false;
        for (String g : validGrades) {
            if (g.equalsIgnoreCase(grade)) {
                isValid = true;
                break;
            }
        }

        if (!isValid) {
            throw new InvalidGradeException("Grade must be between a valid grade");
        }
    }
}

