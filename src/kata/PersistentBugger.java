package kata;

public class PersistentBugger {
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
