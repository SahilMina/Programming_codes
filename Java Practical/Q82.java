class OuterClass {
    static class StaticNestedClass {
        void display() {
            System.out.println("Inside Static Nested Class");
        }
    }
}

public class Q82 {
    public static void main(String[] args) {
        OuterClass.StaticNestedClass obj = new OuterClass.StaticNestedClass();
        obj.display();
    }
}