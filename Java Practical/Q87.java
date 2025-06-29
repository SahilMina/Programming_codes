public class Q87 {

    public static void main(String[] args) {      
        final int divisor = 0;

        int[] numbers = {10, 20, 30};

        try {
            System.out.println("Accessing element at index 5...");
            int value = numbers[5]; 

            System.out.println("Dividing number by zero...");
            int result = numbers[0] / divisor; 

            System.out.println("Result: " + result);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: Array index is out of bounds!");
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero is not allowed!");
        } catch (Exception e) {
            System.out.println("General exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed. Cleanup or closing resources here.");
        }

        System.out.println("Program continues after try-catch-finally.");
    }
}
