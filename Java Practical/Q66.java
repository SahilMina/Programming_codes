
public class Q66 {
  static void vatest(int... v) {
    System.out.print("Number of args:" + v.length + " contents: ");
    for (int x : v)
      System.out.print(x + " ");
    System.out.println();
  }

  public static void main(String args[]) {
    vatest(10);
    vatest(1, 2, 3);
    vatest();
  }
}