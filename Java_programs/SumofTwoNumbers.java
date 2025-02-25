import java.util.Scanner;

public class SumofTwoNumbers {
    public static void main(String[] args) {
        System.out.println("Enter the two numbers:");

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = a + b;

        System.out.println("SUM OF TWO NUMBERS IS: " + c);
        
        input.close();
    }
}
