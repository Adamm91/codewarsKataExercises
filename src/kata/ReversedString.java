package kata;

public class ReversedString {

//    Complete the solution so that it reverses the string value passed into it.
//
//    Kata.solution("world") //return "dlrow"

    public static String solution(String str) {
        char[] array = str.toCharArray();
        String reversed = "";
        for (int i = array.length - 1; i >= 0; i--) reversed += array[i];
        return reversed;
    }
}
