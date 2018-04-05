package kata;

public class ArithmeticProgression {

    /*
        In your class, you have started lessons about arithmetic progression. Since you are also a programmer, you have decided to write a function that will return the first n elements of the sequence with the given common difference r and first element a.

        The result should be a string of numbers, separated by comma and space.

        Example
        arithmetic_sequence_elements(1, 2, 5) == "1, 3, 5, 7, 9"
        # first element: 1, difference: 2, how many: 5
    */

    public static void main(String[] args) {
        System.out.println(arithmeticSequenceElements(1, 2, 5));
    }

    public static String arithmeticSequenceElements(int first, int step, long total) {
        String text = first + "";
        for (int i = 0; i < total - 1; i++) {
            first += step;
            text += ", " + first;
        }
        return text;
    }
}
