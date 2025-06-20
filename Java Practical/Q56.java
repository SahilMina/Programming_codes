class static1 {
    static int a = 3;
    static int b;

    static void math(int x) {
        System.out.println("x =" + x);
        System.out.println("a =" + a);
        System.out.println("b =" + b);
    }

    static {
        System.out.println("Static block initialized.");
        b = a * 4;
    }
}

public class Q56 {
    public static void main(String args[]) {
        static1.math(42);
    }
}