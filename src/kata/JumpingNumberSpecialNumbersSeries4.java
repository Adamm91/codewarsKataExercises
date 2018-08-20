package kata;

public class JumpingNumberSpecialNumbersSeries4 {

    /*
    Definition

Jumping number is the number that All adjacent digits in it differ by 1.

Task

Given a number, Find if it is Jumping or not .

Warm-up (Highly recommended)

Playing With Numbers Series

Notes

Number passed is always Positive .
Return the result as String .
The difference between ‘9’ and ‘0’ is not considered as 1 .
All single digit numbers are considered as Jumping numbers.
Input >> Output Examples

1- jumpingNumber(9) ==> return "Jumping!!"
Explanation:

It's single-digit number
2- jumpingNumber(79) ==> return "Not!!"
Explanation:

Adjacent digits don't differ by 1
3- jumpingNumber(23) ==> return "Jumping!!"
Explanation:

Adjacent digits differ by 1
4- jumpingNumber(556847) ==> return "Not!!"
Explanation:

Adjacent digits don't differ by 1
5- jumpingNumber(4343456) ==> return "Jumping!!"
Explanation:

Adjacent digits differ by 1
6- jumpingNumber(89098) ==> return "Not!!"
Explanation:

Adjacent digits don't differ by 1
7- jumpingNumber(32) ==> return "Jumping!!"
Explanation:

Adjacent digits differ by 1
     */

    public static void main(String[] args) {
        System.out.println(jumpingNumber(89098));
        System.out.println(jumpingNumber(32));
        System.out.println(jumpingNumber(4543));
        System.out.println(jumpingNumber(9878));
        System.out.println(jumpingNumber(185090));
    }

    public static String jumpingNumber(int number) {
        boolean result = true;
        String s = String.valueOf(number);
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            int a = chars[i];
            int b = chars[i + 1];
            if (a < b && a + 1 != b) result = false;
            else if (a > b && a - 1 != b) result = false;
        }
        return result ? "Jumping!!" : "Not!!";
    }
}
