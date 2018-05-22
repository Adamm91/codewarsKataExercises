package kata;

import java.util.Arrays;

public class ProductArrayArraySeries5 {

    /*
    Task
    Given an array/list [] of integers , Construct a product array Of same size Such That prod[i] is equal to The Product of all the elements of Arr[] except Arr[i].

    Notes
    Array/list size is at least 2 .

    Array/list's numbers Will be only Postives

    Repeatition of numbers in the array/list could occur.

    Input >> Output Examples
    1- productArray ({12,20}) ==>  return {20,12}
    Explanation:
    The first element in prod [] array 12 is the product of all array's elements except the first element

    The second element 20 is the product of all array's elements except the second element .

    2- productArray ({1,5,2}) ==> return {10,2,5}
     */


    public static int[] productArray(int[] numbers) {
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            int sum = 1;
            for (int j = 0; j < numbers.length; j++) {
                sum *= numbers[j];
            }
            sum /= numbers[i];
            answer[i] = sum;
        }
        return answer;
    }

}
