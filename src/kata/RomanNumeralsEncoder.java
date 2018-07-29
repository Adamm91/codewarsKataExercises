package kata;

public class RomanNumeralsEncoder {

    public static void main(String[] args) {
        System.out.println(solution(2437));
    }


    public static String solution(int n) {
        StringBuilder result = new StringBuilder();
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        while (n > 0) {
            for (int i = 0; i < values.length; i++)
                if (n >= values[i]) {
                    n -= values[i];
                    result.append(symbols[i]);
                    break;
                }
        }
        return result.toString();
    }
}
