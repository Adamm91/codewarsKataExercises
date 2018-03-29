package kata;

public class TheHighestProfitWins {
    public static int[] minMax(int[] arr) {
        int min, max;
        min = max = arr[0];
        for (int i : arr) {
            if (min > i) min = i;
            if (max < i) max = i;
        }
        return new int []{min, max};
    }
}
