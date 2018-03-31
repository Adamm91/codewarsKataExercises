package kata;

public class PersistentBugger {

//    Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence,
//    which is the number of times you must multiply the digits in num until you reach a single digit.
//
//    For example:
//
//    persistence(39) == 3 // because 3*9 = 27, 2*7 = 14, 1*4=4
//    // and 4 has only one digit
//
//    persistence(999) == 4 // because 9*9*9 = 729, 7*2*9 = 126,
//    // 1*2*6 = 12, and finally 1*2 = 2
//
//    persistence(4) == 0 // because 4 is already a one-digit number

    public static void main(String[] args) {
        long n = 39l;
        long n1 = 999l;
        long n2 = 4l;
        System.out.println(persistence(n));
        System.out.println(persistence(n1));
        System.out.println(persistence(n2));
    }

    public static int persistence(long n) {
        int counter = 0;
        while (String.valueOf(n).toCharArray().length > 1) {
            int number = 1;
            String s = String.valueOf(n);
            char[] array = s.toCharArray();
                for (int i = 0; i <array.length; i++) {
                    number *= Integer.parseInt(String.valueOf(array[i]));
                }
            counter ++;
            n = number;
        }
        return counter;
    }
}
