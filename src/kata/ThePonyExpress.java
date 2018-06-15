package kata;


import java.util.Arrays;

public class ThePonyExpress {

//    It reduced the time for messages to travel between the Atlantic and Pacific coasts to about 10 days, before it was made obsolete by the transcontinental telegraph.
//
//    How it worked
//    There were a number of stations, where:
//
//    The rider switched to a fresh horse and carried on, or
//    The mail bag was handed over to the next rider
//    Kata Task
//    stations is a list/array of distances (miles) from one station to the next along the Pony Express route.
//
//    Implement the riders method/function, to return how many riders are necessary to get the mail from one end to the other.
//
//            NOTE: Each rider travels as far as he can, but never more than 100 miles.

    public static void main(String[] args) {
        System.out.println(Arrays.stream(new int[]{14, 8, 17, 34, 29, 16, 27, 26, 32, 42, 45}).sum());
        System.out.println(riders(new int[]{14, 8, 17, 34, 29, 16, 27, 26, 32, 42, 45}));
    }

    public static int riders(final int[] stations) {
        int result = 1;
        int sum = 0;
        for (int i = 0; i < stations.length - 1; i++) {
            sum += stations[i];
            if (sum + stations[i+1] > 100) {
                result++;
                sum = 0;
            }
        }
        return result;
    }
}
