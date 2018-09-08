package kata;

public class SimpleStringDivisionII {
    /*
    Consider the string "1 2 36 4 8". We want to take pairs of these numbers, concatenate each pair and determine how many of them of divisible by k.

If k = 3, we get following numbers ['12', '18', '21', '24', '42', '48', '81', '84'], all divisible by 3.
Note:
-- 21 and 12 are different pairs.
-- Elements must be from different indices, so '3636` is not a valid concatenated pair.
Given a string of numbers and an integer k, return the number of pairs that when concatenated, are divisible by k.

solve("1 2 36 4 8", 3) = 8, because they are ['12', '18', '21', '24', '42', '48', '81', '84']
solve("1 3 6 3", 3) = 6. They are ['36', '33', '63', '63', '33', '36']
More examples in test cases. Good luck!
     */

    public static void main(String[] args) {
        System.out.println(solve("1 2 36 4 8", 3));
    }

    public static int solve(String s, int k) {
        int count = 0;
        String[] strings = s.split(" ");
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings.length; j++)
                if (i != j && Integer.valueOf(strings[i] + strings[j]) % k == 0) count++;
        }
        return count;
    }
}