package kata;

public class ConvertNumberToReversedArrayOfDigits {
    public static int[] digitize(long n) {
        // Code here
        String s = String.valueOf(n);
        char[] array = s.toCharArray();
        int[] ints = new int[array.length];
        for (int i = 0; i < array.length; i++) ints[i] = Character.getNumericValue(array[array.length - (1 + i)]);
        return ints;
    }
}
