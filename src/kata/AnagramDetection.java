package kata;

import java.util.Arrays;

public class AnagramDetection {

//    An anagram is the result of rearranging the letters of a word to produce a new word (see wikipedia).
//    Note: anagrams are case insensitive
//    Complete the function to return true if the two arguments given are anagrams of theeach other; return false otherwise.
//            Examples
//    "foefet" is an anagram of "toffee"
//    "Buckethead" is an anagram of "DeathCubeK"

    public static void main(String[] args) {
        String text1 = "Buckethead";
        String text2 = "DeathCubeK";
        System.out.println(isAnagram(text1, text2));
    }

    public static boolean isAnagram(String test, String original) {
        if (test.length() != original.length()) return false;
        char[] array = test.toLowerCase().toCharArray();
        char[] array1 = original.toLowerCase().toCharArray();
        Arrays.sort(array);
        Arrays.sort(array1);
        return Arrays.equals(array, array1);
    }
}
