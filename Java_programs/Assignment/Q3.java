import java.util.Scanner;

public class Q3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter two integers: ");
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();
    System.out.println("Sum: " + (num1 + num2));
    System.out.println("Difference: " + (num1 - num2));
    System.out.println("Product: " + (num1 * num2));
    System.out.println("Quotient: " + (num1 / num2));
    System.out.println("Remainder: " + (num1 % num2));
    scanner.close();
  }
}
