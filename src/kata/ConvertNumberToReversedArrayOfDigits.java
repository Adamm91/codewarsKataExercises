package kata;

public class ConvertNumberToReversedArrayOfDigits {

//    You have to return the digits of this number within an array in reverse order.
//
//            Example:
//            348597 => [7,9,5,8,4,3]

    public static int[] digitize(long n) {
        // Code here
        String s = String.valueOf(n);
        char[] array = s.toCharArray();
        int[] ints = new int[array.length];
        for (int i = 0; i < array.length; i++) ints[i] = Character.getNumericValue(array[array.length - (1 + i)]);
        return ints;
    }
}
