package kata;

public class ThinkfulStringDrillsRepeater {
    /*
    Write a class function named repeat() that takes two arguments (a string and a long integer), and returns a new string where the input string is repeated that many times. For example:

    Repeater.repeat("a", 5)
    should return

    "aaaaa"
     */

    public static String repeat(String string,long n){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }
}
