package kata;

import java.util.Arrays;

public class DescendingOrder {

//    Your task is to make a function that can take any non-negative integer as a argument
//    and return it with its digits in descending order. Essentially,
//    rearrange the digits to create the highest possible number.

        public static int sortDesc(final int num) {
            char[] array = String.valueOf(num).toCharArray();
            Arrays.sort(array);
            char[] reverseSorted = new char[array.length];
            for (int i = 0; i < array.length; i++) {
                reverseSorted[i] = array[array.length - (1 + i)];
            }
            String s = String.valueOf(reverseSorted);
            int i = Integer.parseInt(s);
            return i;
        }
}
