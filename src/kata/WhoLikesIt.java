package kata;

public class WhoLikesIt {
    /*
    You probably know the "like" system from Facebook and other pages. People can "like" blog posts, pictures or other items. We want to create the text that should be displayed next to such an item.

Implement a function likes :: [String] -> String, which must take in input array, containing the names of people who like an item. It must return the display text as shown in the examples:

likes {} // must be "no one likes this"
likes {"Peter"} // must be "Peter likes this"
likes {"Jacob", "Alex"} // must be "Jacob and Alex like this"
likes {"Max", "John", "Mark"} // must be "Max, John and Mark like this"
likes {"Alex", "Jacob", "Mark", "Max"} // must be "Alex, Jacob and 2 others like this"
     */

    public static String whoLikesIt(String... names) {
        String solution = "";
        if (names.length == 0 || names[0].isEmpty()) solution += "no one likes this";
        else if (names.length == 1) solution += names[0] + " likes this";
        else if (names.length == 2) solution += names[0] + " and " + names[1] + " like this";
        else if (names.length == 3) solution += names[0] + ", " + names[1] + " and " + names[2] + " like this";
        else if (names.length > 3) solution += names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
        return solution;
    }

    public static void main(String[] args) {
        System.out.println(whoLikesIt(""));
        System.out.println(whoLikesIt("Peter"));
        System.out.println(whoLikesIt("Peter", "Alex"));
        System.out.println(whoLikesIt("Peter", "Alex", "Jason"));
        System.out.println(whoLikesIt("Peter", "Alex", "Jason", "Gugu"));
        System.out.println(whoLikesIt("Peter", "Alex", "Jason", "Gigi", "Knotosake"));
    }
}
