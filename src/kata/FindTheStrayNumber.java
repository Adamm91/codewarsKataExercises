package kata;

import java.util.Arrays;

public class FindTheStrayNumber {

//    You are given an odd-length array of integers, in which all of them are the same, except for one single number.
//    Complete the method which accepts such an array, and returns that single different number.
//    The input array will always be valid! (odd-length >= 3)
//
//    Examples
//    [1, 1, 2] ==> 2
//    [17, 17, 3, 17, 17, 17, 17] ==> 3

    public static void main(String[] args) {
        int[] ints = {17, 17, 3, 17, 17, 17, 17};
        System.out.println(stray(ints));
    }

    static int stray(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0] < numbers[1] ? numbers[0] : numbers[numbers.length - 1];
    }
}
