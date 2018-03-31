package kata;

import java.util.Arrays;

public class SumWithoutHighestAndLowestNumber {

    /*
    Sum all the numbers of the array (in F# and Haskell you get a list) except the highest and the lowest element
    (the value, not the index!).
    (The highest/lowest element is respectively only one element at each edge,
    even if there are more than one with the same value!)

    Example:

    { 6, 2, 1, 8, 10 } => 16
    { 1, 1, 11, 2, 3 } => 6

    If array is empty, null or None, or if only 1 Element exists, return 0.
    Note:In C++ instead null an empty vector is used. In C there is no null. ;-)

    -- There's no null in Haskell, therefore Maybe [Int] is used. Nothing represents null.
    Have fun coding it and please don't forget to vote and rank this kata! :-)
    I have created other katas. Have a look if you like coding and challenges.
     */

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
