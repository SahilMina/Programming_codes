final class SecureData {
    void display() {
        System.out.println("Final class: Cannot be inherited.");
    }
}

// Error: Cannot extend final class
// class ChildData extends SecureData {}

public class Q81 {
    public static void main(String[] args) {
        SecureData obj = new SecureData();
        obj.display();
    }
}