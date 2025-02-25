import java.util.Scanner;

public class Armstrongcheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();
        
        int original = num, sum = 0, count = 0, temp = num;
        
        
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            int power = 1;
            for (int i = 0; i < count; i++) {
                power *= digit;
            }
            sum += power;
            temp /= 10;
        }
        
        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
    }
}
