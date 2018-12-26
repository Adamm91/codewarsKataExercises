package kata;

public class DuplicateEncoder {
    /*
    The goal of this exercise is to convert a string to a new string
    where each character in the new string is '(' if that character appears only once in the original string,
    or ')' if that character appears more than once in the original string.
     Ignore capitalization when determining if a character is a duplicate.

Examples:

"din" => "((("

"recede" => "()()()"

"Success" => ")())())"

"(( @" => "))(("
     */

    static String encode(String word){
        word = word.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            stringBuilder.append(word.indexOf(c) == word.lastIndexOf(c) ? "(" : ")");
        }
            return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(encode("Prespecialized"));
        System.out.println(encode("   ()(   "));
    }
}
