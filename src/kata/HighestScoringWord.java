package kata;

public class HighestScoringWord {
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
