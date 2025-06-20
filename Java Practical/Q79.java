class Constants {
    final int MAX_SPEED = 120;

    void display() {
        System.out.println("Max Speed: " + MAX_SPEED);
    }
}

public class Q79 {
    public static void main(String[] args) {
        Constants obj = new Constants();
        obj.display();
    }
}