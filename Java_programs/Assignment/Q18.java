import java.util.Scanner;

public class Q18 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number (N): ");
    int n = scanner.nextInt();

    int sum = 0, i = 1;

    do {
      sum += i;
      i++;
    } while (i <= n);

    System.out.println("Sum of numbers from 1 to " + n + " is: " + sum);

    scanner.close();
  }
}
