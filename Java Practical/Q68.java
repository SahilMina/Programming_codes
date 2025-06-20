class A {
    int a;
    int b;

    A(int i, int j) {
        a = i;
        b = j;
        System.out.println("Hi from A");
    }
}

class B extends A {
    int c;

    B(int i, int j, int k) {
        super(i, j);
        c = k;
        System.out.println("Hi from B");
    }

    public static void main(String args[]) {

        B obj_b = new B(1, 2, 3);
    }
}