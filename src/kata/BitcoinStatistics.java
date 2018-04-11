package kata;

import java.util.Arrays;

public class BitcoinStatistics {

    /*
        Your friend Phil came up with a great new Bitcoin investment strategy, but before he can start making millions,
        he needs to know the minimum, average and maximum exchange rate for certain periods in the last few months.

        He'll pay you 0.5 Bitcoin for a function that takes several arrays (one for each period)
        and calculates the minimum, average and maximum for each array, as well as the total minimum, average and maximum.
         Some numbers at the start and end of each period don't agree with Phil's theory, so he wants you to discard them.

        For example, for the input

        discard = 2
        array 0 = 800,1200,2100,4100,1300,700 // discard 800,1200 at start and 1300,700 at end
        array 1 = 1000,1500,4500,5000,5800,2000,1500 // discard 1000,1500 at start and 2000,1500 at end

        your function should return

        array 0 = 2100,3100,4100 // min, avg, max for input array 0 (without discarded values)
        array 1 = 4500,5100,5800 // min, avg, max for input array 1 (without discarded values)
        array 2 = 2100,4300,5800 // total min, avg, max (without discarded values)
        Good luck!
    */

    public static void main(String[] args) {
       double[][] data = {
               {800,1200,2100,4100,1300,700},
               {1000,1500,4500,5000,5800,2000,1500}
       };

        System.out.println((getMinAvgMax(2, data)));
    }

    public static double[][] getMinAvgMax(int discard, double[][] data) {
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        double avg = 0;
        double finishAvg = 0;
        int counter = 0;
        int finishCounter = 0;
        double[][] array = new double[data.length + 1][3];
        for (int j = 0; j < data.length; j++) {
            for (int i = discard; i < data[j].length - discard; i++) {
                counter++;
                if (data[j][i] < min) min = data[j][i];
                if (data[j][i] > max) max = data[j][i];
                avg += data[j][i];
                finishAvg += data[j][i];
                finishCounter++;
            }
            avg /= counter;
            array[j][0] = min;
            array[j][1] = avg;
            array[j][2] = max;
            avg = 0;
            counter = 0;
            min = Double.MAX_VALUE;
            max = Double.MIN_VALUE;
        }
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array[j].length; i++) {
                if (array[j][0] < min) min = array[j][i];
                if (array[j][2] > max) max = array[j][i];
            }
        }
        array[array.length - 1][0] = min;
        array[array.length - 1][1] = finishAvg / finishCounter;
        array[array.length - 1][2] = max;
        return array;
    }

}
