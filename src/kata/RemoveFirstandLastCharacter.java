package kata;

public class RemoveFirstandLastCharacter {
    public static void main(String[] args) {
        String a = "Adam";
        System.out.println(remove(a));
    }
    public static String remove(String str) {
        return str.substring(1, str.length() - 1);
    }
}
