import java.util.Scanner;

public class Q10 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the student's percentage: ");
    double percentage = scanner.nextDouble();
    char grade;
    if (percentage >= 90) {
      grade = 'A';
    } else if (percentage >= 80) {
      grade = 'B';
    } else if (percentage >= 70) {
      grade = 'C';
    } else if (percentage >= 60) {
      grade = 'D';
    } else {
      grade = 'F';
    }
    System.out.println("The assigned grade is: " + grade);
    scanner.close();
  }
}
