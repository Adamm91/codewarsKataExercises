package kata;

public class IsNDivisibleBy {

    public static void main(String[] args) {
        int a1 = 6;
        int a2 = 2;
        int a3 = 3;

        int b1 = 3;
        int b2 = 3;
        int b3 = 4;

        System.out.println(isDivisible(a1, a2, a3));
        System.out.println(isDivisible(b1, b2, b3));
    }

    public static boolean isDivisible(int... ints) {
        for (int i = 0; i < ints.length; i++)
            if (ints[i] == 0 || ints[0] % ints[i] != 0) return false;
        return true;
    }
}