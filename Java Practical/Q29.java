import java.util.Scanner;

public class Q29 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a character: ");
    char ch = scanner.next().charAt(0);

    switch (ch) {
      case 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
          'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z':
        System.out.println(ch + " is an uppercase letter.");
        break;
      case 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
          'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z':
        System.out.println(ch + " is a lowercase letter.");
        break;
      default:
        System.out.println("you are stupid.");
    }

    scanner.close();
  }
}
