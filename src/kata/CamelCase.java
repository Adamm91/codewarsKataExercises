package kata;

public class CamelCase {
    // returns "theStealthWarrior"
//    toCamelCase("the-stealth-warrior")

    // returns "TheStealthWarrior"
//    toCamelCase("The_Stealth_Warrior")
    public static void main(String[] args) {
        System.out.println(toCamelCase("the-stealth-warrior"));
        System.out.println(toCamelCase("The_Stealth_Warrior"));
    }

    private static String toCamelCase(String input) {
        String[] split = input.split("-|_| ");
        for (int i = 1; i < split.length; i++) {
            char[] array = split[i].toCharArray();
            if (array[0] >= 'a' && array[0] <= 'z') {
                array[0] -= 32;
                split[i]= String.valueOf(array);
            }
        }
        StringBuilder camelCase = new StringBuilder();
        for (String s : split) camelCase.append(s);
        return camelCase.toString();
    }
}
