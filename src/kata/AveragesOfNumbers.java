package kata;

import java.util.Arrays;

public class AveragesOfNumbers {
    public static void main(String[] args) {
        int[] input = {1, 3, 5, 1, -10};
        System.out.println(Arrays.toString(averages(input)));
    }

    public static double[] averages(int[] numbers) {
        if (numbers == null || numbers.length == 0 || numbers.length == 1) return new double[0];
        double[] doubles = new double[numbers.length - 1];
        for (int i = 0; i < numbers.length - 1; i++) {
            doubles[i] = numbers[i] + ((numbers[i + 1] - numbers[i]) / 2.0);
        }
        return doubles;
    }
}
