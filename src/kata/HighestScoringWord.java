package kata;

public class HighestScoringWord {

//    Given a string of words, you need to find the highest scoring word.
//    Each letter of a word scores points according to it's position in the alphabet: a = 1, b = 2, c = 3 etc.
//    You need to return the highest scoring word as a string.
//    If two words score the same, return the word that appears earliest in the original string.
//    All letters will be lowercase and all inputs will be valid.

    public static void main(String[] args) {
        String text = "what time are we climbing up to the volcano";
        String text1 = "take me to semynak";
        String text2 = "man i need a taxi up to ubud";
        System.out.println(high(text));
        System.out.println(high(text1));
        System.out.println(high(text2));
    }

    public static String high(String s) {
        int points = 0, maxPoints = 0, indexOfHightest = 0;
        String[] split = s.split(" ");
        for (int i = 0; i < split.length; i++) {
            for (char c : split[i].toCharArray()) {
                if (c >= 'a' && c <= 'z') points += (int) c - 96;
            }
            if (maxPoints < points){
                maxPoints = points;
                indexOfHightest = i;
            }
            points = 0;
        }
        return split[indexOfHightest];
    }

}
