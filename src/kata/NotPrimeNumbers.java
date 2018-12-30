package kata;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class NotPrimeNumbers {
    /*
    You are given two positive integers a and b (a < b <= 20000).
    Complete the function which returns a list of all those numbers in the interval [a, b)
     whose digits are made up of prime numbers (2, 3, 5, 7) but which are not primes themselves.

Be careful about your timing!

Good luck :)
     */

    public static List<Integer> notPrimes(int a, int b) {
        List<Integer> integers = new ArrayList<>();
        int i = a;
        while (i < b) {
            if (String.valueOf(i).contains("1")
                    || String.valueOf(i).contains("4")
                    || String.valueOf(i).contains("6")
                    || String.valueOf(i).contains("8")
                    || String.valueOf(i).contains("9")
                    || String.valueOf(i).contains("0")
                    || BigInteger.valueOf(i).isProbablePrime(i))
                i++;
            else {
                integers.add(i);
                i++;
            }
        }
        return integers;
    }


    public static void main(String[] args) {
        System.out.println(notPrimes(2700, 3000));
        int x = 12;
        System.out.println(BigInteger.valueOf(x).isProbablePrime(x));
    }
}
