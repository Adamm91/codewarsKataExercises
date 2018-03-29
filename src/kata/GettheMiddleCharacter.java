package kata;

public class GettheMiddleCharacter {
    public static String getMiddle(String word) {
        int a = 0;
        if (word.length() % 2 == 1) a = word.length() / 2;
        else a = word.length() / 2 - 1;
        return word.substring(a, word.length() - a);
    }
}
