package kata;

import java.util.Arrays;

public class SortedYesOrNoAndHow {

//    Complete the method which accepts an array of integers, and returns one of the following:
//
//    "yes, ascending" - if the numbers in the array are sorted in an ascending order
//    "yes, descending" - if the numbers in the array are sorted in a descending order
//    "no" - otherwise
//    You can assume the array will always be valid, and there will always be one correct answer.

    public static void main(String[] args) {

        int[] array = new int[] {1, 2};
        int[] array1 = new int[]{15, 7, 3, -8};
        int[] array2 = new int[]{4, 2, 30};
        System.out.println(isSortedAndHow(array));
        System.out.println(isSortedAndHow(array1));
        System.out.println(isSortedAndHow(array2));
    }

    public static String isSortedAndHow(int[] array) {
        int[] clone = array.clone();
        Arrays.sort(clone);
        int[] reversedClone = new int[clone.length];
        for (int i = 0; i < reversedClone.length; i++) {
            reversedClone[i] = clone[clone.length - (1 + i)];
        }
        return Arrays.equals(clone, array) ? "yes, ascending" :
                Arrays.equals(reversedClone, array) ? "yes, descending" : "no";
    }
}
