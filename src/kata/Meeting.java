package kata;

import java.util.Arrays;

public class Meeting {
    /*
    John has invited people. His list is:

s = "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";
Could you make a program that

makes this string uppercase
gives it sorted in alphabetical order by last name. When the last names are the same, sort them by first name.
 Last name and first name of a guest come in the result between parentheses separated by a comma.
 So the result of function meeting(s) will be:
"(CORWILL, ALFRED)(CORWILL, FRED)(CORWILL, RAPHAEL)(CORWILL, WILFRED)(TORNBULL, BARNEY)(TORNBULL, BETTY)(TORNBULL, BJON)"
It can happen that in two distinct families with the same family name two people have the same first name too.
Notes

You can see another examples in the "Sample tests".
Translators are welcome for all languages.
     */

    public static String meeting(String s) {
        String[] persons = s.split(";");
        StringBuilder finalResult = new StringBuilder();
        String[] names = new String[persons.length];
        for (int i = 0; i < persons.length; i++) {
            String[] split = persons[i].split(":");
            String name = "(" + split[1] + ", " + split[0] + ")";
            names[i] = name.toUpperCase();
        }
        Arrays.sort(names);
        for (String name : names) finalResult.append(name);
        return finalResult.toString();
    }

    public static void main(String[] args) {
        String name = "Fred:Corwill;Wilfred:Corwill;Alfred:Corwill";
        String name2 = "Alexis:Wahl;John:Bell;Victoria:Schwarz;Abba:Dorny;Grace:Meta;Ann:Arno;Madison:STAN;Alex:Cornwell;Lewis:Kern;Megan:Stan;Alex:Korn";
        System.out.println(meeting(name));
        System.out.println(meeting(name2));
    }
}
