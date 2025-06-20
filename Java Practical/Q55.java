class Values {
  int principle = 1000, rate = 5, time = 10;
}

class Amount extends Values {
  void calculate() {
    System.out.println("Your interest Amount: " + (principle * rate * time) / 100);
  }
}

class AAmount extends Amount {
  AAmount() {
    System.out.println("Hi");
  }
}

public class Q55 {
  public static void main(String[] args) {
    AAmount A = new AAmount();
    A.calculate();
  }
}
