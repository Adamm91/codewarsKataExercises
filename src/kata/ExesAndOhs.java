package kata;

public class ExesAndOhs {
    /*
    Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.

Examples input/output:

XO("ooxx") => true
XO("xooxx") => false
XO("ooxXm") => true
XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
XO("zzoo") => false
     */

    public static boolean getXO (String str) {
        char[] chars = str.toLowerCase().toCharArray();
        int o = 0;
        int x = 0;
        for (char aChar : chars) {
            if (String.valueOf(aChar).equals("x")) x++;
            if (String.valueOf(aChar).equals("o")) o++;
        }
        return o == x;
    }
}
