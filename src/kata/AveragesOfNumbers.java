package kata;

import java.util.Arrays;

public class AveragesOfNumbers {

//    Write a method, that gets an array of integer-numbers and
//    return an array of the averages of each integer-number and his follower, if there is one.
//
//            Example:
//
//    Input:  [ 1, 3, 5, 1, -10]
//    Output:  [ 2, 4, 3, -4.5]
//    If the array has 0 or 1 values or is null or None, your method should return an empty array.
//
//    Have fun coding it and please don't forget to vote and rank this kata! :-)

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
