import java.util.Scanner;

public class Q2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int intValue = scanner.nextInt();
    System.out.print("Enter a double: ");
    double doubleValue = scanner.nextDouble();
    scanner.nextLine();
    System.out.print("Enter a string: ");
    String stringValue = scanner.nextLine();
    System.out.println("Integer: " + intValue);
    System.out.println("Double: " + doubleValue);
    System.out.println("String: " + stringValue);
    scanner.close();
  }
}
