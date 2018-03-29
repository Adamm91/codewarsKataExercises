package kata;

import java.util.Arrays;

public class HighestAndLowest {
    public static String HighAndLow(String numbers) {
        String[] split = numbers.split(" ");
        Integer[] integers = new Integer[split.length];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = Integer.valueOf(split[i]);
        }
        Arrays.sort(integers);
        return integers[integers.length - 1] + " " + integers[0];
    }
}
