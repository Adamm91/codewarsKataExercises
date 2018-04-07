package kata;

public class WhatTimeIsIt {

    /*
        How many times have we been asked this simple question in our daily lives by family, friends and strangers alike?

        In this kata you take a look at your watch and answer this question in proper English. Sometimes you have your watch in 24h format and others in 12h. The AM/PM part of the time is always disregarded as the asker knows whether it's morning or afternoon.

        Requirements:
        Mind the punctuation for the full hours; o'clock is written as one word.
        Spacing between individual words is strictly limited to one space. Cardinal numbers greater than 20 are hyphenated (e.g. "twenty-one").
        Input is always going to be a non-null string in the format \d{2}:\d{2}(\s?[ap]m)?
        Both 12h and 24h input may be present. In case of 12h input disregard the am/pm part.
        Remember that in 24h midnight is denoted as 00:00.
        There may or may not be a space between the minutes and the am/pm part in 12h format.
        Examples:
        toHumanTime("05:28 pm"); // twenty-eight minutes past five
        toHumanTime("12:00");    // twelve o'clock
        toHumanTime("03:45am");  // quarter to four
        toHumanTime("07:15");    // quarter past seven
        toHumanTime("23:30");    // half past eleven
        toHumanTime("00:01");    // one minute past twelve
        toHumanTime("17:51");    // nine minutes to six
     */


    public static void main(String[] args) {
        String time = "00:02";
        System.out.println(toHumanTime(time));
    }

    public static String toHumanTime(String time) {
        String[] split = time.split(":");
        Integer hours = Integer.valueOf(split[0]);
        if (split[1].length() >= 3) split[1] = split[1].substring(0, 2);
        Integer minutes = Integer.valueOf(split[1]);
        if (hours > 12) {
            hours -= 12;
        } else if (hours == 0) hours = 12;
        switch (minutes) {
            case 0:
                return time(hours) + " o'clock";
            case 1:
                return "one minute past " + time(hours);
            case 15:
                return "quarter past " + time(hours);
            case 30:
                return "half past " + time(hours);
            case 45:
                if (hours + 1 > 12) hours -= 12;
                return "quarter to " + time(hours + 1);
            case 59:
                if (hours + 1 > 12) hours -= 12;
                return "one minute to " + time(hours + 1);
            default:
                if (minutes < 30) {
                    return time(minutes) + " minutes past " + time(hours);
                }
                if (hours + 1 > 12) hours -= 12;
                    return time(60 - minutes) + " minutes to " + time(hours + 1);
        }
    }

    private final static String time(int n) {
        String[] hrs = {
                "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "quarter", "sixteen", "seventeen", "eighteen", "nineteen",
                "twenty", "twenty-one", "twenty-two", "twenty-three", "twenty-four", "twenty-five", "twenty-six",
                "twenty-seven", "twenty-eight", "twenty-nine", "half"
        };
        return hrs[n];
    }
}
