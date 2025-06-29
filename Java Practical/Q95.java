import java.util.Scanner;

public class Q95 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        if (!name.matches("[a-zA-Z]+")) {
            System.out.println("Invalid input: Name should contain only letters.");
            sc.close();
            return;
        }
        System.out.print("Enter your age: ");
        String ageInput = sc.nextLine();

        try {
            int age = Integer.parseInt(ageInput);
            if (age <= 0) {
                System.out.println("Invalid input: Age must be positive.");
            } else {
                System.out.println("Hello " + name + ", your age is " + age + ".");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Age must be a number.");
        }

        sc.close();
    }
}
