package kata;

public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
        StringBuilder repeated = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            repeated.append(string);
        }
        return String.valueOf(repeated);
    }
}
