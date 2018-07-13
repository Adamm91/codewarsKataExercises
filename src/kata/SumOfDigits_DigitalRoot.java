package kata;

public class SumOfDigits_DigitalRoot {

    /*
    In this kata, you must create a digital root function.

    A digital root is the recursive sum of all the digits in a number. Given n,
    take the sum of the digits of n. If that value has two digits,
    continue reducing in this way until a single-digit number is produced.
    This is only applicable to the natural numbers.

    Here's how it works (Ruby example given):

    digital_root(16)
    => 1 + 6
    => 7

    digital_root(942)
    => 9 + 4 + 2
    => 15 ...
    => 1 + 5
    => 6
     */

    public static void main(String[] args) {
//        System.out.println(digital_root(16));
        System.out.println(digital_root(942));
        System.out.println(digital_root(493193));
        System.out.println(digital_root(132189));
    }

    public static int digital_root(int n) {
            int tmp = 0;
            while (n > 9) {
                tmp += n % 10;
                n /= 10;
            }
            n += tmp;
        return n > 9 ? digital_root(n) : n;
    }
}
