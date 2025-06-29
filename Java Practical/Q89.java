import java.util.Scanner;
class EligibilityException extends Exception {
    public EligibilityException(String message) {
        super(message);
    }
}

public class Q89 {
    
    static void validateEligibility(double percentage, double gateScore) throws EligibilityException {
        
        if (percentage < 60) {
            throw new EligibilityException("Percentage too low. Minimum 60% required.");
        }

        
        if (gateScore <= 25) {
            throw new EligibilityException("GATE score too low. Must be above 25.");
        }

        
        System.out.println("You are eligible to apply for M.S./M.Tech in Computer Science.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your Bachelor's percentage: ");
            double percentage = scanner.nextDouble();

            System.out.print("Enter your GATE score: ");
            double gateScore = scanner.nextDouble();

            validateEligibility(percentage, gateScore);

        } catch (EligibilityException e) {
            System.out.println("Eligibility Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Input Error: Please enter valid data.");
        } finally {
            System.out.println("Eligibility check completed.");
            scanner.close();
        }
    }
}
