class factorial1 {
    int fact(int n) {
        int result;
        if (n == 1)
            return 1;
        result = fact(n - 1) * n;
        return result;
    }
}

public class Q58 {
    public static void main(String args[]) {
        factorial1 f = new factorial1();
        System.out.println("Factorial of 3 is " + f.fact(3));
    }
}