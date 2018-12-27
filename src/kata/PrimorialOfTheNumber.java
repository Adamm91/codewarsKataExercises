package kata;

import java.math.BigInteger;

public class PrimorialOfTheNumber {
    /*
    Definition (Primorial Of a Number)

Is similar to factorial of a number, In primorial, not all the natural numbers get multiplied, only prime numbers are multiplied to calculate the primorial of a number. It's denoted with P#.

Task

Given a number N , calculate its primorial. !alt  !alt

Notes

Only positive numbers will be passed (N > 0) .
Input >> Output Examples:

1- numPrimorial (3) ==> return (30)
Explanation:

Since the passed number is (3) ,Then the primorial should obtained by multiplying 2 * 3 * 5 = 30 .

Mathematically written as , P3# = 30 .

2- numPrimorial (5) ==> return (2310)
Explanation:

Since the passed number is (5) ,Then the primorial should obtained by multiplying 2 * 3 * 5 * 7 * 11 = 2310 .

Mathematically written as , P5# = 2310 .

3- numPrimorial (6) ==> return (30030)
Explanation:

Since the passed number is (6) ,Then the primorial should obtained by multiplying 2 * 3 * 5 * 7 * 11 * 13 = 30030 .

Mathematically written as , P6# = 30030 .
     */

    public static String numPrimorial(int n) {
        BigInteger result = new BigInteger("1");
        BigInteger x = new BigInteger("2");
        for (int i = 0; i < n; i++) {
            result = result.multiply(x);
            x = x.nextProbablePrime();
        }
        return result + "";
    }

    /*
    *** ANOTHER METHOD ***

    public static String numPrimorial(int n) {
        int amount = 0;
        BigInteger result = new BigInteger("1");
        for (int i = 2; amount < n; i++)
            if (isPrime(i)) {
                amount++;
                result = result.multiply(BigInteger.valueOf(i));
            }
        return result + "";
    }

    public static boolean isPrime(long n) {
        for (int i = 2; i <= n / 2; i++) if (n % i == 0) return false;
        return true;
    }

    */

    public static void main(String[] args) {
        System.out.println(numPrimorial(3));
        System.out.println(numPrimorial(5));
        System.out.println(numPrimorial(6));
    }


}
