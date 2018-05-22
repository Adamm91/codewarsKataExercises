package kata;

import java.util.Arrays;

public class MinimizeSumOfArrayArraySeries1 {

    /*
    Task
    Given an array of intgers , Find the minimum sum which is obtained from summing each Two integers product .

    Notes
    Array/list will contain positives only .
    Array/list will always has even size
    Input >> Output Examples
    1- minSum({5,4,2,3}) ==> return (22)
    Explanation:
    The minimum sum obtained from summing each two integers product , 5*2 + 3*4 = 22
    2- minSum({12,6,10,26,3,24}) ==> return (342)
     */

    public static void main(String[] args) {
        System.out.println(minSum(new int[]{5,4,2,3}));
    }

    public static int minSum(int[] passed) {
        Arrays.sort(passed);
        int sum = 0;
        for (int i = 0; i < passed.length / 2; i++) {
            sum += passed[i] * passed[passed.length - (1 + i)];
        }
        return sum;
    }

}
