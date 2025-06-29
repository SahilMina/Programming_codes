import java.util.Scanner;
class NotEligible extends Exception {
    public NotEligible(String message) {
        super(message);
    }
}

public class Q88 {

    public static void checkAge(int age) throws NotEligible {
        if (age < 18) {
            throw new NotEligible("You are not eligible to vote. Age must be 18 or above.");
        } else {
            System.out.println("You are eligible to vote!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            checkAge(age);
        } 
        
        catch (NotEligible e) {
            System.out.println("Exception: " + e.getMessage());
        } 
        
        catch (java.util.InputMismatchException e) {
            System.out.println("Please enter a valid integer for age.");
        } 
        
        finally {
            scanner.close();
        }
    }
}
