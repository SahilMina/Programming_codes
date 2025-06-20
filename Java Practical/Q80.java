class Parent {
    final void show() {
        System.out.println("This is a final method.");
    }
}

class Child extends Parent {
    // Error: Cannot override final method
    // void show() { System.out.println("Trying to override!"); }
}

public class Q80 {
    public static void main(String[] args) {
        Parent obj = new Parent();
        obj.show();
    }
}