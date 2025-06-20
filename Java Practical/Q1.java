import java.util.Scanner;

public class Q1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter User name: ");
    String name = scanner.nextLine();
    System.out.println("Hello, " + name + "\nHow are you");
    scanner.close();
  }
}
