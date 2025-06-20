class Amount {
  int principle = 1000, rate = 5, time = 10;
}

class AAmount extends Amount {
  void calculate() {
    System.out.println("Your interest Amount: " + (principle * rate * time) / 100);
  }
}

public class Q54 {
  public static void main(String[] args) {
    AAmount A = new AAmount();
    A.calculate();
  }
}
