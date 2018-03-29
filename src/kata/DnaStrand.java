package kata;

public class DnaStrand {
    public static void main(String[] args) {
        String dna1 = "ATTGC";
        String dna2 = "GTAT";
        System.out.println(makeComplement(dna1));
        System.out.println(makeComplement(dna2));
    }

    public static String makeComplement(String dna) {
        char[] array = dna.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'A') array[i] = 'T';
            else if (array[i] == 'T') array[i] = 'A';
            else if (array[i] == 'C') array[i] = 'G';
            else if (array[i] == 'G') array[i] = 'C';
        }
        return String.valueOf(array);
    }
}
