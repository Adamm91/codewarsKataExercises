package kata;

import java.util.Arrays;

public class DataReverse {

    /*
    A stream of data is received and needs to be reversed. Each segment is 8 bits meaning the order of these segments
     need to be reversed:

    11111111 00000000 00001111 10101010

    (byte1) (byte2) (byte3) (byte4)

    10101010 00001111 00000000 11111111

    (byte4) (byte3) (byte2) (byte1)

    Total number of bits will always be a multiple of 8. The data is given in an array as such:
    [1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,1,0,1,0]
     */

    public static void main(String[] args) {
        int[] data1= {0,0,1,1,0,1,1,0,0,0,1,0,1,0,0,1};
        int[] data2= {0,0,1,0,1,0,0,1,0,0,1,1,0,1,1,0};
        int[] data3= {1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,1,0,1,0};
        int[] data4= {1,0,1,0,1,0,1,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1};
    }

    public static int[] DataReverse(int[] data) {
        int [] reversedData = new int[data.length];
        int index = 0;
        int startIndex = data.length - 8;
        int minusIndex = 16;
        int numberOfEights = data.length / 8;
        for (int i = 1; i <= numberOfEights; i++) {
            for (int j = 0; j < 8; j++) {
                reversedData[index] = data[startIndex];
                index++;
                startIndex++;
            }
            startIndex -= minusIndex;
        }
        return reversedData;
    }
}
