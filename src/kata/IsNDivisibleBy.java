package kata;

public class IsNDivisibleBy {

//    Create a function isDivisible(n,...) that checks if the first agrument n is divisible by all other arguments
//    (return true if no other arguments)
//
//    Example:
//
//    isDivisible(6,1,3,)--> true because 6 is divisible by 1 and 3
//    isDivisible(12,2)--> true because 12 is divisible by 2
//    isDivisible(100,5,4,10,25,20)--> true
//    isDivisible(12,7)--> false because 12 is not divisible by 7

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