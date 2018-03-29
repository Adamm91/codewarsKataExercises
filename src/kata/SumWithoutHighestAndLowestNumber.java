package kata;

import java.util.Arrays;

public class SumWithoutHighestAndLowestNumber {
    public static void main(String[] args) {
        int[] ints = {6, 2, 1, 8, 10};
        System.out.println(sum(ints));
    }

        public static int sum(int[] numbers) {
            if (numbers == null || numbers.length == 1 || numbers.length == 0) return 0;
            Arrays.sort(numbers);
            int sum = Arrays.stream(numbers).sum() - numbers[0] - numbers[numbers.length - 1];
            return sum;
        }
}
