import java.util.Scanner;

public class Q14 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = scanner.nextInt();
    scanner.close();

    int originalNum = num;
    int reversed = 0;

    while (num != 0) {
      int digit = num % 10;
      reversed = reversed * 10 + digit;
      num /= 10;
    }

    if (originalNum == reversed) {
      System.out.println(originalNum + " is a palindrome.");
    } else {
      System.out.println(originalNum + " is not a palindrome.");
    }
  }
}
