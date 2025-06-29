import java.util.*;

class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String msg) {
        super(msg);
    }
}

public class Q90 {
    static Map<String, Boolean> books = new HashMap<>();

    static void borrowBook(String title) throws BookNotAvailableException {
        if (!books.containsKey(title))
            throw new BookNotAvailableException("Book not found.");
        if (!books.get(title))
            throw new BookNotAvailableException("Book already borrowed.");
        books.put(title, false);
        System.out.println("You borrowed: " + title);
    }

    public static void main(String[] args) {
        books.put("Java", true);
        books.put("Python", true);
        books.put("C++", true);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book title to borrow: ");
        String title = sc.nextLine();

        try {
            borrowBook(title);
        } catch (BookNotAvailableException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
