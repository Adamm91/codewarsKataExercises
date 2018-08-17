package kata;

import java.util.Arrays;

public class FormTheMinimum {
    /*
    Task

Given a list of digits, return the smallest number that could be formed from these digits, using the digits only once ( ignore duplicates).

Notes :

Only positive integers will be passed to the function (> 0 ), no negatives or zeros.
Input >> Output Examples

1- minValue ({1, 3, 1})  ==> return (13)
Explanation:

(13) is the minimum number could be formed from {1, 3, 1} , Without duplications

2- minValue({5, 7, 5, 9, 7})  ==> return (579)
Explanation:

(579) is the minimum number could be formed from {5, 7, 5, 9, 7} , Without duplications

3- minValue({1, 9, 3, 1, 7, 4, 6, 6, 7}) return  ==> (134679)
Explanation:

(134679) is the minimum number could be formed from {1, 9, 3, 1, 7, 4, 6, 6, 7} , Without duplications


     */

    public static void main(String[] args) {
        System.out.println(minValue(new int[]{1, 9, 3, 1, 7, 4, 6, 6, 7}));
    }

    public static int minValue(int[] values){
        Arrays.sort(values);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < values.length - 1; i++)
            if (values[i] != values[i + 1])
            sb.append(values[i]);
        sb.append(values[values.length - 1]);
        return Integer.parseInt(sb.toString());
    }
}
