import java.util.Scanner;

public class Q34 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double feet = scanner.nextDouble();
    double meters = feettoMeters(feet);
    System.out.println(feet + " feet is equal to " + meters + " meters.");
    scanner.close();
  }

  public static double feettoMeters(double feet) {
    return feet * 0.3048;
  }
}
