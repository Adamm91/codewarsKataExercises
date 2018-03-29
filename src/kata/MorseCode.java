package kata;

public class MorseCode {
    //MorseCode.decode(".... . -.--   .--- ..- -.. .")
    // "HEY JUDE"
    //MorseCode.encode("HEY JUDE")
    // ".... . -.--   .--- ..- -.. ."
    private static char[] signs = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
            'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
            ',', '.', '?'};

    private static String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
            "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
            "-----", "--..--", ".-.-.-", "..--.."};



    public static void main(String[] args) {

        System.out.println(encode("HEY JUDE"));
        System.out.println(decode(".... . -.--   .--- ..- -.. ."));
    }

    public static String encode(String input) {
        String s = input.toLowerCase();
        char[] array = s.toCharArray();
        String mors = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < signs.length; j++) {
                if(array[i] == signs[j])
                    mors += morse[j] + " ";
            }
        }
        return mors;
    }

    public static String decode(String input) {
        String[] split = input.split(" ");
        String decodeMors = "";
        for (int i = 0; i < split.length; i++) {
            for (int j = 0; j < morse.length; j++) {
                if (split[i].equals(morse[j]))
                    decodeMors += signs[j] + "";
            }
            if (i + 1 < split.length && split[i + 1].equals("") ){
                decodeMors += " ";
                i++;
            }
        }
        return decodeMors.toUpperCase();
    }
}
