package kata;

public class RemoveStringSpaces {
//    Simple, remove the spaces from the string, then return the resultant string.
    static String noSpace(final String x) {
        char[] array = x.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != ' ')
                stringBuilder.append(array[i]);
        }
        return String.valueOf(stringBuilder);
    }
}
