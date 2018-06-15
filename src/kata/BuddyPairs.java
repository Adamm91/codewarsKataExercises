package kata;

public class BuddyPairs {
    /*
    You know what divisors of a number are. The divisors of a positive integer n are said to be proper
    when you consider only the divisors other than n itself. In the following description,
    divisors will mean proper divisors.
For 100 they are 1, 2, 4, 5, 10, 20, 25, and 50.

Let s(n) be the sum of these proper divisors of n.
Call buddy two positive integers such that the sum of the proper divisors of each number is one more
than the other number.
(n m) are a pair of buddy if s(m) = n + 1 and s(n) = m + 1.

Example
(48 75) is such a pair.
Divisors of 48 are 1 2 3 4 6 8 12 16 24 -> sum = 76 ie 75 + 1
Divisors of 75 are 1 3 5 15 25  -> sum = 49 ie 48 + 1
Task
given two positive integers start and limit the function buddy(start, limit)
finds the first pair (n m) of buddy pairs such that n (positive integer) is between
start (inclusive) and limit (inclusive); m can be greater than limit and has to be greater than n.

buddy(10, 50) returns "(48 75)"
buddy(48, 50) returns "(48 75)"
or
buddy(10, 50) returns [48, 75]
buddy(48, 50) returns [48, 75]
Note for C: The returned string will be free'd.

If there is no buddy pair satisfying the conditions let us return "Nothing".
     */

    public static void main(String[] args) {
        System.out.println(buddy(1081184, 1331967));
        System.out.println(buddy(2382, 3679));
        System.out.println(buddy(381, 4318));
    }

    public static String buddy(long start, long limit) {
        for (long n = start; n <= limit; n++) {
            int div_n = divisors(n);
            int m = div_n - 1;
            if (m > n) {
                int div_m = divisors(m);
                if (div_m == n + 1) return "(" + n + " " + m + ")";
            }
        }
        return "Nothing";
    }

    public static int divisors(long number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) sum += i;
        }
        return sum;
    }

}
