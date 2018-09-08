package kata;

public class ReverseNumber {

    /*
    Given a number, write a function to output its reverse digits. (e.g. given 123 the answer is 321)

Numbers should preserve their sign; i.e. a negative number should still be negative when reversed.

Examples

 123 ->  321
-456 -> -654
1000 ->    1
     */

    public static void main(String[] args) {
        System.out.println(reverse(321));
        System.out.println(reverse(6432));
        System.out.println(reverse(123));
        System.out.println(reverse(1000));
        System.out.println(reverse(-123));
    }

    public static int reverse(int number) {
        return number < 0 ? Integer.parseInt(new StringBuilder().append(number * -1).append("-").reverse().toString())
                : Integer.parseInt(new StringBuilder("" + number).reverse().toString());
    }
}
