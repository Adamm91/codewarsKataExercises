package kata;

public class AAddBMustHaveAHundredTwentyThree {

    /*
    Given number A you must return number B so that

    (int) (A + B) == 123
    Note
    B can't be negative
     */

    public static void main(String[] args) {
        int a = -2147483648;
        System.out.println(int123(a));
    }

    public static long int123(final int a) {
        return a > 123 ? Long.MAX_VALUE - a + 124 : (long)123 - a;
    }
}
