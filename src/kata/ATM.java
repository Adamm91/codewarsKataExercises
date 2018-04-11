package kata;

public class ATM {

    /*
    There is enough money available on ATM in nominal value 10, 20, 50, 100, 200 and 500 dollars.

    You are given money in nominal value of n with 1<=n<=1500.

    Try to find minimal number of notes that must be used to repay in dollars, or output -1 if it is impossible.
     */

    public static void main(String[] args) {
        System.out.println(solve(125));
    }

    public static int solve(int n) {
        final int[] nominals = {500, 200, 100, 50, 20, 10};
        int counter = 0;
        int i = 0;
        while (n > 0 && i < nominals.length) {
            if (n - nominals[i] >= 0) {
                n -= nominals[i];
                counter++;
            }
            i++;
        }
        return n == 0 ? counter : -1;
    }
}
