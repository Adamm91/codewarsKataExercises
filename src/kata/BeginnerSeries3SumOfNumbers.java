package kata;

public class BeginnerSeries3SumOfNumbers {

//    Given two integers a and b, which can be positive or negative,
//    find the sum of all the numbers between including them too and return it.
//    If the two numbers are equal return a or b.
//
//            Note: a and b are not ordered!
//
//    Examples
//    GetSum(1, 0) == 1   // 1 + 0 = 1
//    GetSum(1, 2) == 3   // 1 + 2 = 3
//    GetSum(0, 1) == 1   // 0 + 1 = 1
//    GetSum(1, 1) == 1   // 1 Since both are same
//    GetSum(-1, 0) == -1 // -1 + 0 = -1
//    GetSum(-1, 2) == 2  // -1 + 0 + 1 + 2 = 2


    public static void main(String[] args) {
        System.out.println(getSum(6, 3));
    }
    public static int getSum(int a, int b) {
        if (a == b) return a;
        int sum = 0;
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        return sum;
    }
}
