
public class Q61 {

  static int count = 0;

  Q61() {
    count++;
  }

  public static void main(String[] args) {
    Q61 obj1 = new Q61();
    Q61 obj2 = new Q61();
    Q61 obj3 = new Q61();
    Q61 obj4 = new Q61();
    System.out.println("Number of objects created:" + count);
  }
}