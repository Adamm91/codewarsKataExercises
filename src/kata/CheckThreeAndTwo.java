package kata;

import java.util.Arrays;

public class CheckThreeAndTwo {

    /*
        Given an array with 5 string values "a", "b" or "c", check if the array contains three and two of the same values.

        Examples
        ["a", "a", "a", "b", "b"] ==> true  // 3x "a" and 2x "b"
        ["a", "b", "c", "b", "c"] ==> false // 1x "a", 2x "b" and 2x "c"
        ["a", "a", "a", "a", "a"] ==> false // 5x "a"
     */

    public static void main(String[] args) {
        char[] text = {'a', 'b', 'a', 'b', 'a'};
        System.out.println(checkThreeAndTwo(text));
    }

    public static boolean checkThreeAndTwo(char[] chars) {
        Arrays.sort(chars);
        int counterA = 0, counterB = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[0] == chars[i]) counterA++;
            if (chars[chars.length - 1] == chars[i]) counterB++;
        }
        return counterA == 3 && counterB == 2 || counterB == 3 && counterA == 2;
    }
}
