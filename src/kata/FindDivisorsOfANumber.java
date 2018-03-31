package kata;

public class FindDivisorsOfANumber {

//    Find the number of divisors of a positive integer n.
//
//    Random tests go up to n = 500000.
//
//    Examples
//    divisors 4  = 3 -- 1, 2, 4
//    divisors 5  = 2 -- 1, 5
//    divisors 12 = 6 -- 1, 2, 3, 4, 6, 12
//    divisors 30 = 8 -- 1, 2, 3, 5, 6, 10, 15, 30
    public static void main(String[] args) {
        System.out.println(numberOfDivisors(4));
        System.out.println(numberOfDivisors(5));
        System.out.println(numberOfDivisors(12));
        System.out.println(numberOfDivisors(30));
    }

    public static long numberOfDivisors(int n) {
        long counter = 1;
        for (int i = 1; i <= n / 2; i++)
            if (n % i == 0) counter++;
        return n > 0 ? counter : 0;
    }
}
