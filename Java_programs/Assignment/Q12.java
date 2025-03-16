
// Assuming non-leap year
import java.util.Scanner;

public class Q12 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a month number (1-12): ");
    int month = scanner.nextInt();
    int days;
    switch (month) {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        days = 31;
        break;
      case 4:
      case 6:
      case 9:
      case 11:
        days = 30;
        break;
      case 2:
        days = 28;
        break;
      default:
        System.out.println("You are stupid");
        scanner.close();
        return;
    }
    System.out.println("Number of days: " + days);
    scanner.close();
  }
}
