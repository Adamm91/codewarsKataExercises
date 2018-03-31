package kata;

public class BasicMathematicalOperations {
    public static void main(String[] args) {

//        Your task is to create a function that does four basic mathematical operations.
//
//                The function should take three arguments - operation(string/char), value1(number), value2(number).
//                The function should return result of numbers after applying the chosen operation.

        System.out.println(basicMath("/", 5, 0));
    }

    public static Integer basicMath(String op, int v1, int v2) {
        switch (op) {
            case "+": return v1 + v2;
            case "-": return v1 - v2;
            case "*": return v1 * v2;
            case "/":
                if (v2 == 0) throw new IllegalArgumentException("Cannot divide by 0");
                return v1 / v2;
        }
        return 0;
    }
}
