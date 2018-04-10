package kata;

import java.util.Arrays;

public class FindTheOddInt {


    public static void main(String[] args) {
        int[] value = {1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5};
        int[] value1 = {5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10};
        System.out.println(findIt2(value));
        System.out.println(findIt2(value1));
    }

    public static int findIt(int[] A) {
        int result = 0;
        int min = Arrays.stream(A).min().getAsInt();
        int max = Arrays.stream(A).max().getAsInt();
        int[] values = new int[max - min + 1];
        int[] counters = new int[max - min + 1];
        for (int i = 0; i < values.length; i++) {
            values[i] = min;
            min++;
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < values.length; j++) {
                if (A[i] == values[j]) {
                    counters[j]++;
                }
            }
        }
        for (int i = 0; i < counters.length; i++) {
            if (counters[i] % 2 == 1) result = values[i];
        }
        return result;
    }

    public static int findIt2(int[] A) {
        int result = 0;
        for (int i : A) {
            result ^= i;
        }
        return result;
    }
}
