package kata;

import org.assertj.core.api.Assertions;

public class TimeFormatter {
    public static void main(String[] args) {
        Assertions.assertThat(format(62)).isEqualTo("1 minute and 2 seconds");
        Assertions.assertThat(format(3662)).isEqualTo("1 hour, 1 minute and 2 seconds");

//        System.out.println(format(62));
//        System.out.println(format(3662));
    }

    private static String format(int seconds) {
        String time;
        int tmpSec = seconds;
        int hrs = 0, min = 0, sec = 0;
        if (tmpSec >= 3600) {
            hrs = tmpSec / 3600;
            tmpSec -= 3600 * hrs;
        }
        if (tmpSec >= 60) {
            min = tmpSec / 60;
            sec = tmpSec % 60;
        }

        return seconds > 3600 ? hrs + " hour, " + min + " minute " + "and " + sec + " seconds" :
               min +  " minute " + "and " + sec + " seconds";
    }
}
