package kata;

import java.util.Arrays;

public class MaximumLengthDifference {
    public static int mxdiflg(String[] a1, String[] a2) {
        int maxValue = 0;
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                int abs = Math.abs(a1[i].length() - a2[j].length());
                if (abs > maxValue) maxValue = abs;
            }
        }
        return a1.length == 0 || a2.length == 0 || a1 == null || a2 == null ? -1 : maxValue;
    }
}
