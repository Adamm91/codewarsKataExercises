package kata;

public class BouncingBalls {
    public static int bouncingBall(double h, double bounce, double window) {
        if (h > 0 && bounce > 0 && bounce < 1 && window < h) {
            double actualHeight = h * bounce;
            int counter = 1;
            while (actualHeight >= window){
                actualHeight *= bounce;
                counter += 2;
            }
            return counter;
        }
        return -1;
    }
}
