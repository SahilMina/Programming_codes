import java.util.Scanner;

public class DataTypeInputSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose a data type to enter:");
        System.out.println("1. Byte");
        System.out.println("2. Short");
        System.out.println("3. Integer");
        System.out.println("4. Long");
        System.out.println("5. Float");
        System.out.println("6. Double");
        System.out.println("7. Character");
        System.out.println("8. Boolean");
        System.out.println("9. String");
        
        System.out.print("Enter your choice (1-9): ");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                System.out.print("Enter a byte value: ");
                byte b = scanner.nextByte();
                System.out.println("You entered byte: " + b);
                break;
            case 2:
                System.out.print("Enter a short value: ");
                short s = scanner.nextShort();
                System.out.println("You entered short: " + s);
                break;
            case 3:
                System.out.print("Enter an int value: ");
                int i = scanner.nextInt();
                System.out.println("You entered int: " + i);
                break;
            case 4:
                System.out.print("Enter a long value: ");
                long l = scanner.nextLong();
                System.out.println("You entered long: " + l);
                break;
            case 5:
                System.out.print("Enter a float value: ");
                float f = scanner.nextFloat();
                System.out.println("You entered float: " + f);
                break;
            case 6:
                System.out.print("Enter a double value: ");
                double d = scanner.nextDouble();
                System.out.println("You entered double: " + d);
                break;
            case 7:
                System.out.print("Enter a character: ");
                char c = scanner.next().charAt(0);
                System.out.println("You entered char: " + c);
                break;
            case 8:
                System.out.print("Enter a boolean value (true/false): ");
                boolean bool = scanner.nextBoolean();
                System.out.println("You entered boolean: " + bool);
                break;
            case 9:
                scanner.nextLine(); // Consume the newline
                System.out.print("Enter a string: ");
                String str = scanner.nextLine();
                System.out.println("You entered string: " + str);
                break;
            default:
                System.out.println("Invalid choice!");
        }
        
        scanner.close();
    }
}
