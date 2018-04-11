package kata;

public class CreatePhoneNumber {

    /*
    Write a function that accepts an array of 10 integers (between 0 and 9),
    that returns a string of those numbers in the form of a phone number.

    Example:
    Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
    The returned format must be correct in order to complete this challenge.
    Don't forget the space after the closing parentheses!
     */

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(createPhoneNumber(numbers));
    }

    public static String createPhoneNumber2(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for (int i = 0; i < numbers.length; i++) {
            sb.append(numbers[i]);
            if (i == 2) sb.append(") ");
            if (i == 5) sb.append("-");
        }
        return sb.toString();
    }

    public static String createPhoneNumber(int[] numbers) {
        String text = "(xxx) xxx-xxxx";
        for (int number : numbers) {
            text = text.replaceFirst("x", Integer.toString(number));
        }
        return text;
    }
}
