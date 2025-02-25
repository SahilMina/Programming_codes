import java.util.Scanner;

public class PrimeUptoN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("Prime numbers up to " + n + ":");
        
        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;
            
            for (int i = 2; i * i <= num; i++) { 
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
