package kata;

public class Factorial {
    public static int factorial(int n) {
        if (n < 0 || n > 12) throw new IllegalArgumentException("0 < n < 12");
        return n == 0 ? 1 : n * factorial(n - 1);
    }
}
