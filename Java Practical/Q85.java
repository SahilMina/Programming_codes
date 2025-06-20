class StaticBlockExample {
    static {
        System.out.println("Static block executed!");
    }

    StaticBlockExample() {
        System.out.println("Constructor called!");
    }
}

public class Q85 {
    public static void main(String[] args) {
        new StaticBlockExample();
        new StaticBlockExample();
    }
}