package kata;

import java.util.Arrays;

public class FindTheSmallestIntegerInTheArray {
    public static int findSmallestInt(int[] args) {
        Arrays.sort(args);
        return args[0];
    }
}
