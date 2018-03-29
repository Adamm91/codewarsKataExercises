package kata;

public class ReversedString {
    public static String solution(String str) {
        char[] array = str.toCharArray();
        String reversed = "";
        for (int i = array.length - 1; i >= 0; i--) reversed += array[i];
        return reversed;
    }
}
