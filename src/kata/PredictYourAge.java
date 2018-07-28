package kata;

import java.util.Arrays;

public class PredictYourAge {
    /*
    My grandfather always predicted how old people would get, and right before he passed away he revealed his secret!

    In honor of my grandfather's memory we will write a function using his formula!

    Take a list of ages when each of your great-grandparent died.
    Multiply each number by itself.
    Add them all together.
    Take the square root of the result.
    Divide by two.
    Example
    predictAge(65, 60, 75, 55, 60, 63, 64, 45) === 86
    Note: the result should be rounded down to the nearest integer.

    Some random tests might fail due to a bug in the JavaScript implementation. Simply resubmit if that happens to you.
         */

    public static void main(String[] args) {
        System.out.println(predictAge(65, 60, 75, 55, 60, 63, 64, 45));
    }

    public static int predictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8) {
        int[] ints = {age1, age2, age3, age4, age5, age6, age7, age8};
        for (int i = 0; i < ints.length; i++) ints[i] *= ints[i];
        int sum = Arrays.stream(ints).sum();
        double sqrt = Math.sqrt(sum) / 2;
        return (int) sqrt;
    }
}
