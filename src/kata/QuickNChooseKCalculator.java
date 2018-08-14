package kata;

import java.math.BigInteger;

public class QuickNChooseKCalculator {

    public static void main(String[] args) {
        System.out.println(choose(10, 20));
    }

    public static BigInteger choose(int n, int k) {
        return n == k ? BigInteger.ONE : n < k ? BigInteger.ZERO : factorial(BigInteger.valueOf(n)).divide(factorial(BigInteger.valueOf(k)).multiply(factorial(BigInteger.valueOf(n - k))));
    }

    public static BigInteger factorial(BigInteger n) {
        return n == BigInteger.ONE || n == BigInteger.ZERO ? BigInteger.ONE : n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }
}
