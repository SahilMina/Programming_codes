class test2 {
    int a;
    public int b;
    private int c;

    void setc(int i) {
        c = i;
    }

    int getc() {
        return c;
    }
}

public class Q59 {
    public static void main(String args[]) {
        test2 d = new test2();
        d.a = 10;
        d.b = 20;
        d.setc(100);
        System.out.println("a, b, c: " + d.a + ", " +
                d.b + " ," + d.getc());
    }
}