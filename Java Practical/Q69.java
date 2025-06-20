class A {
  int a;
  int b;

  A(int i, int j) {
    a = i;
    b = j;
    System.out.println("HI from A3");
  }

  A(A obj_a) {
    a = obj_a.a;
    b = obj_a.b;
    System.out.println("HI from A2");
  }
}

class Q69 extends A {
  int c;

  Q69(int i, int j, int k) {
    super(i, j);
    c = k;
    System.out.println("HI from A1");
  }

  Q69(Q69 obj_b) {
    super(obj_b);
    c = obj_b.c;
    System.out.println("HI from B");
  }

  public static void main(String args[])

  {

    Q69 obj_b1 = new Q69(1, 2, 3);

    Q69 obj_b2 = new Q69(obj_b1);

  }
}