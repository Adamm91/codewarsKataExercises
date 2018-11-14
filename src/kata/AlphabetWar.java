package kata;

public class AlphabetWar {

    /*
    Introduction

There is a war and nobody knows - the alphabet war!
There are two groups of hostile letters. The tension between left side letters and right side letters was too high and the war began.

Task

Write a function that accepts fight string consists of only small letters and return who wins the fight. When the left side wins return Left side wins!, when the right side wins return Right side wins!, in other case return Let's fight again!.

The left side letters and their power:

 w - 4
 p - 3
 b - 2
 s - 1
The right side letters and their power:

 m - 4
 q - 3
 d - 2
 z - 1
The other letters don't have power and are only victims.

Example

AlphabetWar("z");        //=> Right side wins!
AlphabetWar("zdqmwpbs"); //=> Let's fight again!
AlphabetWar("zzzzs");    //=> Right side wins!
AlphabetWar("wwwwwwz");  //=> Left side wins!
Alphabet war Collection
     */
    public static void main(String[] args) {
        System.out.println(alphabetWar("z"));
        System.out.println(alphabetWar("zdqmwpbs"));
        System.out.println(alphabetWar("zzzzs"));
        System.out.println(alphabetWar("wwwwwwz"));
    }
    public static String alphabetWar(String fight){
        int leftSide = 0, rightSide = 0;

        for (int i = 0; i < fight.length(); i++) {
            switch (fight.charAt(i)) {
                case 'w': leftSide += 4; break;
                case 'p': leftSide += 3; break;
                case 'b': leftSide += 2; break;
                case 's': leftSide += 1; break;
                case 'm': rightSide += 4; break;
                case 'q': rightSide += 3; break;
                case 'd': rightSide += 2; break;
                case 'z': rightSide += 1; break;
            }
        }
        return leftSide > rightSide ? "Left side wins!" : rightSide > leftSide ? "Right side wins!" : "Let's fight again!";
    }
}
