package kata;

public class BeginnerSeries3SumOfNumbers {

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
