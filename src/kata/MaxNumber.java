package kata;

import java.util.Arrays;

public class MaxNumber {

    public static void main(String[] args) {
        System.out.println(maxNumber(213));
        System.out.println(maxNumber(7398));
        System.out.println(maxNumber(43481));
        System.out.println(maxNumber(913489));
    }

    public static int maxNumber(int number) {
        String s = String.valueOf(number);
        char[] chars = s.toCharArray();
        StringBuilder result = new StringBuilder();
        Arrays.sort(chars);
        for (char c : chars) result.append(c);
        return Integer.parseInt(result.reverse().toString());
    }
}
