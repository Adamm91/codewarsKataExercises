package kata;

public class FindDivisorsOfANumber {
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
