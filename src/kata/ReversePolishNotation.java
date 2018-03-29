package kata;

import org.assertj.core.api.Assertions;

import java.util.Stack;

public class ReversePolishNotation {
    // https://pl.wikipedia.org/wiki/Odwrotna_notacja_polska
    //expression 5 1 2 + 4 * + 3 - (which is equivalent to 5 + ((1 + 2) * 4) - 3 in normal notation) should evaluate to 14

    public static void main(String[] args) {
        Assertions.assertThat(calculate("5 1 2 + 4 * + 3 -")).isEqualTo(14);
    }

    public static boolean isNumber(String string) {
        return string.equals("+") || string.equals("-") || string.equals("*") || string.equals("/") ? false : true;
    }

    public static int calculate(String input) {
        String[] split = input.split(" ");
        Stack<String> integers = new Stack<>();
        for (int i = 0; i < split.length; i++) {
            int a = 0, b = 0, c = 0;
            if (isNumber(split[i])) integers.add(split[i]);
            if (!isNumber(split[i])) {
                a = Integer.parseInt(integers.pop());
                b = Integer.parseInt(integers.pop());
                switch (split[i]) {
                    case "+":
                        c = b + a;
                        break;
                    case "-":
                        c = b - a;
                        break;
                    case "*":
                        c = b * a;
                        break;
                    case "/":
                        c = b / a;
                        break;
                }
                integers.add(String.valueOf(c));
            }
        }
        return Integer.valueOf(integers.pop());
    }
}
