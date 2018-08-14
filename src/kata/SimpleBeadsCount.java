package kata;

public class SimpleBeadsCount {
    public static int countRedBeads(final int nBlue) {
        return nBlue < 2 ? 0 : (nBlue - 1) * 2;
    }
}
