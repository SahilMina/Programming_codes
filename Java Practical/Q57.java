class test1 {
    int a;

    test1(int i) {
        a = i;
    }

    test1 incrbyten() {
        test1 temp = new test1(a + 10);
        return temp;
    }
}

public class Q57 {
    public static void main(String args[]) {
        test1 ob1 = new test1(2);
        test1 ob2;
        ob2 = ob1.incrbyten();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);
        ob2 = ob2.incrbyten();
        System.out.println("ob2.a after second increase: "
                + ob2.a);
    }
}