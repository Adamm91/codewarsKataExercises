package kata;

import java.util.Arrays;

public class DataReverse {
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
