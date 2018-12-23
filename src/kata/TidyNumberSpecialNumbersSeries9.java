package kata;

import java.util.Arrays;

public class TidyNumberSpecialNumbersSeries9 {
    /*
    Definition

A Tidy number is a number whose digits are in non-decreasing order.

Task

Given a number, Find if it is Tidy or not .

Warm-up (Highly recommended)

Playing With Numbers Series

Notes

Number passed is always Positive .
Return the result as a Boolean
Input >> Output Examples

1- tidyNumber (12) ==> return (true)
Explanation:

The number's digits { 1 , 2 } are in non-Decreasing Order (i.e) 1 <= 2 .

2- tidyNumber (32) ==> return (false)
Explanation:

The Number's Digits { 3, 2} are not in non-Decreasing Order (i.e) 3 > 2 .

3- tidyNumber (1024) ==> return (false)
Explanation:

The Number's Digits {1 , 0, 2, 4} are not in non-Decreasing Order as 0 <= 1 .

4- tidyNumber (13579) ==> return (true)
Explanation:

The number's digits {1 , 3, 5, 7, 9} are in non-Decreasing Order .

5- tidyNumber (2335) ==> return (true)
Explanation:

The number's digits {2 , 3, 3, 5} are in non-Decreasing Order , Note 3 <= 3
     */

    public static boolean tidyNumber(int number) {
        String numberString = String.valueOf(number);
        char[] chars = numberString.toCharArray();
        Arrays.sort(chars);
        String sortedNumberString = String.valueOf(chars);
        return numberString.equals(sortedNumberString);
    }

    public static void main(String[] args) {
        System.out.println(tidyNumber(12));
        System.out.println(tidyNumber(21));
    }

}
