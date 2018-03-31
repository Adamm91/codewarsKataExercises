package kata;

public class CountOfPositivesSumOfNegatives {

//    Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers.
//
//    If the input array is empty or null, return an empty array:
//
//    C#/Java: new int[] {} / new int[0];
//    C++: std::vector<int>();
//    JavaScript/CoffeeScript/PHP/Haskell: [];
//    Rust: Vec::<i32>::new();
//    ATTENTION!
//    The passed array should NOT be changed. Read more here.
//
//    For example:
//
//    input int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}
//    return int[] {10, -65}.

    public static int[] countPositivesSumNegatives(int[] input) {
        int counterOfPos = 0, sum = 0;
        if (input == null || input.length == 0) return new int [0];
        for (int i : input) {
            if (i > 0) counterOfPos++;
            else sum += i;
        }
        return new int[]{counterOfPos, sum};
    }
}
