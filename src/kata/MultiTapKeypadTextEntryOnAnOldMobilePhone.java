package kata;

public class MultiTapKeypadTextEntryOnAnOldMobilePhone {
    public static void main(String[] args) {
        String text = "LOL";
        String text1 = "HOW R U";
        System.out.println(presses(text));
        System.out.println(presses(text1));
    }

    public static int presses(String phrase) {
        int pressCounter = 0;
        String[] keys = {"1", "ABC2", "DEF3", "GHI4", "JKL5", "MNO6", "PQRS7", "TUV8", "WXYZ9", "*", " 0", "#"};
        for (char c : phrase.toUpperCase().toCharArray()) {
            for (String key : keys) {
                pressCounter += key.indexOf(c) + 1;
            }
        }
        return pressCounter;
    }
}
