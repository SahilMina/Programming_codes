package Java_Programs;

class Balance {
    String name;
    double bal;

    Balance(String n, double b) {
        name = n;
        bal = b;
    }

    void show() {
        if (bal > 0)
            System.out.print("--> ");
        System.out.println(name + ": $" + bal);
    }
}

public class Q75 {
    public static void main(String args[]) {
        Balance current[] = new Balance[3];
        current[0] = new Balance("Ajay", 123.23);
        current[1] = new Balance("vijay", 157.02);
        current[2] = new Balance("sanjay", 12.33);
        for (int i = 0; i < 3; i++)
            current[i].show();
    }
}
