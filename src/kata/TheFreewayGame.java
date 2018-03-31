package kata;

public class TheFreewayGame {
    public static void main(String[] args) {

        /*
        When I am more bored than usual I sometimes like to play the following counting game I made up:

        As I join the freeway my count is 0
        Add 1 for every car that I overtake
        Subtract 1 for every car that overtakes me
        Stop counting when I reach my exit
        What an easy game! What fun!

        Kata Task
        You will be given

        The distance to my exit (km)
        How fast I am going (kph)
        Information about a lot of other cars
        Their time (relative to me) as I join the freeway. For example,
        -1.5 means they already passed my starting point 1.5 minutes ago
        2.2 means they will pass my starting point 2.2 minutes from now
        How fast they are going (kph)
        Find what is my "score" as I exit the freeway!
         */

    }

    public static int freewayGame(final double distKmToExit, final double mySpeedKph, final double[][] otherCars) {
        int counter = 0;
        double myTimeInMins = distKmToExit / mySpeedKph * 60;
        double speedOfOtherCar, timeOfOtherCar;
        for (int i = 0; i < otherCars.length; i++) {
            speedOfOtherCar = otherCars[i][1];
            timeOfOtherCar = (distKmToExit / speedOfOtherCar) * 60 + otherCars[i][0];
            if (timeOfOtherCar < myTimeInMins && otherCars[i][0] >= 0) counter--;
            else if (timeOfOtherCar > myTimeInMins && otherCars[i][0] <= 0) counter++;
        }
        return counter;
    }
}
