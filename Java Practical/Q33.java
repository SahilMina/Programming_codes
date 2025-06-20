import java.util.Scanner;

public class Q33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int originalnum = num, sum = 0, n = 0, temp = num;

        while (temp > 0) {
            n++;
            temp /= 10;
        }

        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            int power = 1;
            for (int i = 0; i < n; i++) {
                power *= digit;
            }
            sum += power;
            temp /= 10;
        }

        if (sum == originalnum) {
            System.out.println("Number is armstrong.");
        } else {
            System.out.println("Number is not armstrong.");
        }
    }
}
