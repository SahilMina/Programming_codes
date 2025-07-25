import java.util.Scanner;

public class Q19 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = scanner.nextInt();

    int count = 0;
    int temp = num;

    if (temp == 0) {
      count = 1;
    } else {
      while (temp != 0) {
        temp /= 10;
        count++;
      }
    }

    System.out.println("Number of digits in " + num + " is: " + count);

    scanner.close();
  }
}
