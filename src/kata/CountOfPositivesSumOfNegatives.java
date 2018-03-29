package kata;

public class CountOfPositivesSumOfNegatives {
    public static int[] countPositivesSumNegatives(int[] input) {
        int counterOfPos = 0, sum = 0;
        if (input == null || input.length == 0) return new int [0];
        for (int i : input) {
            if (i > 0) counterOfPos++;
            else sum += i;
        }
        return new int[]{counterOfPos, sum};
    }
}
