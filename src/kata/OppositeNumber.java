package kata;

public class OppositeNumber {

    // Find the opposite number without any conditions
    // Example: [1] = [-1];
    //          [15] = [-15];
    //          [-4] = [4];
    public static void main(String[] args) {
        System.out.println(opposite(-15));
    }

    public static int opposite(int number) {
        return number * (-1);
    }
}
