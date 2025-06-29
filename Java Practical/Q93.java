import java.util.*;
class InvalidGradeException extends Exception {
    public InvalidGradeException(String msg) {
        super(msg);
    }
}

public class Q93 {
    static void assignGrade(String name, int grade) throws InvalidGradeException {
        if (grade < 0 || grade > 100)
            throw new InvalidGradeException("Grade must be between 0 and 100.");
        
        String result;
        if (grade >= 90) result = "A";
        else if (grade >= 80) result = "B";
        else if (grade >= 70) result = "C";
        else if (grade >= 60) result = "D";
        else result = "F";
        
        System.out.println(name + " received grade: " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter grade (0-100): ");
        int grade = sc.nextInt();

        try {
            assignGrade(name, grade);
        } catch (InvalidGradeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
