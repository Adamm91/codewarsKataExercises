package kata;

public class ToLeetSpeak {

    /*
    Your task is to write a function toLeetSpeak that converts a regular english sentence to Leetspeak.
    More about LeetSpeak You can read at wiki -> https://en.wikipedia.org/wiki/Leet
    Consider only uppercase letters (no lowercase letters, no numbers) and spaces.

    For example:
    toLeetSpeak("LEET") returns "1337"
    */

    public static void main(String[] args) {
        String speak = "LEET";
        System.out.println(toLeetSpeak(speak));
    }

    static String toLeetSpeak(final String speak) {
        String s = speak.toUpperCase();
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case 'A':
                    sb.append('@');
                    break;
                case 'B':
                    sb.append('8');
                    break;
                case 'C':
                    sb.append('(');
                    break;
                case 'E':
                    sb.append('3');
                    break;
                case 'G':
                    sb.append('6');
                    break;
                case 'H':
                    sb.append('#');
                    break;
                case 'I':
                    sb.append('!');
                    break;
                case 'L':
                    sb.append('1');
                    break;
                case 'O':
                    sb.append('0');
                    break;
                case 'S':
                    sb.append('$');
                    break;
                case 'T':
                    sb.append('7');
                    break;
                case 'Z':
                    sb.append('2');
                    break;
                default:
                    sb.append(chars[i]);
                    break;
            }
        }
        return sb.toString();
    }
}
