class A3 {

    A3() {
        System.out.println("Inside A's constructor.");
    }
}

class B3 extends A3 {
    B3() {
        System.out.println("Inside B's constructor.");
    }
}

class Q71 {
    public static void main(String args[]) {
        B3 b = new B3();
    }
}