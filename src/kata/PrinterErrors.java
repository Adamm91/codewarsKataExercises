package kata;

public class PrinterErrors {
    public static void main(String[] args) {
        String s="aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";
        System.out.println(printerError(s));

    }

    public static String printerError(String s) {
        int counterOfErrors = 0;
        for (char c : s.toCharArray()) {
            if (c < 'a' || c > 'm') counterOfErrors++;
        }
        return counterOfErrors + "/" + s.length();
    }
}
