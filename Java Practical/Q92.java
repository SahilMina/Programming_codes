import java.util.*;
class ProductOutOfStockException extends Exception {
    public ProductOutOfStockException(String msg) {
        super(msg);
    }
}

public class Q92 {
    static Map<String, Integer> inventory = new HashMap<>();
    static void purchase(String product, int qty) throws ProductOutOfStockException {
        if (!inventory.containsKey(product))
            throw new ProductOutOfStockException("Product not found.");
        int stock = inventory.get(product);
        if (stock < qty)
            throw new ProductOutOfStockException("Not enough stock for " + product);
        inventory.put(product, stock - qty);
        System.out.println("Purchased " + qty + " of " + product);
    }

    public static void main(String[] args) {
        inventory.put("Laptop", 5);
        inventory.put("Mouse", 10);
        inventory.put("Keyboard", 3);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product name: ");
        String product = sc.nextLine();
        System.out.print("Enter quantity to purchase: ");
        int qty = sc.nextInt();

        try {
            purchase(product, qty);
        } catch (ProductOutOfStockException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
