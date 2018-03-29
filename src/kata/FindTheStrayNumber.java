package kata;

import java.util.Arrays;

public class FindTheStrayNumber {
    public static void main(String[] args) {
        int[] ints = {17, 17, 3, 17, 17, 17, 17};
        System.out.println(stray(ints));
    }

    static int stray(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0] < numbers[1] ? numbers[0] : numbers[numbers.length - 1];
    }
}
