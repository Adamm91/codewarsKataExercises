package kata;

import java.util.Arrays;

public class HelpTheFruitGuy {
    /*
    Our fruit guy has a bag of fruit (represented as an array of strings) where some fruits are rotten. He wants to replace all the rotten pieces of fruit with fresh ones. For example, given ["apple","rottenBanana","apple"] the replaced array should be ["apple","banana","apple"]. Your task is to implement a method that accepts an array of strings containing fruits should returns an array of strings where all the rotten fruits are replaced by good ones.

    Notes
    If the array is null/nil/None or empty you should return empty array ([]).
    The rotten fruit name will be in this camelcase (rottenFruit).
    The returned array should be in lowercase.
     */


    public static String[] removeRotten(String[] fruitBasket) {
        if (fruitBasket == null || fruitBasket.length == 0) return new String[0];
        String[] clone = fruitBasket.clone();
        for (int i = 0; i < clone.length; i++)
            clone[i] = clone[i].replaceAll("rotten", "").toLowerCase();
        return clone;
    }

    public static void main(String[] args) {
        String[] rotten = new String []{"rottenApple","rottenBanana","rottenApple","rottenPineapple","rottenKiwi"};
        String[] rotten2 = null;
        System.out.println(Arrays.toString(removeRotten(rotten)));
        System.out.println(Arrays.toString(removeRotten(rotten2)));
    }
}
