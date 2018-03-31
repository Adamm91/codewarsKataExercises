package kata;

public class StringRepeat {

//    Write a function called repeatStr which repeats the given string string exactly n times.
//
//    repeatStr(6, "I") // "IIIIII"
//    repeatStr(5, "Hello") // "HelloHelloHelloHelloHello"

    public static String repeatStr(final int repeat, final String string) {
        StringBuilder repeated = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            repeated.append(string);
        }
        return String.valueOf(repeated);
    }
}
