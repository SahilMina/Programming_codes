class A4 {
    void callme() {
        System.out.println("Inside A's callme method");
    }
}

class B4 extends A4 {

    void callme() {
        System.out.println("Inside B's callme method");
    }
}

class Q73 {

    public static void main(String args[]) {

        A4 a = new A4();

        B4 b = new B4();

        A4 r;

        r = a;

        r.callme();

        r = b;
        r.callme();
    }
}