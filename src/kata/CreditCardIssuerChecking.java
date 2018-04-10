package kata;

public class CreditCardIssuerChecking {

    /*
        Given a credit card number we can determine who the issuer/vendor is with a few basic knowns.

        Complete the function getIssuer() that will use the values shown below to determine the card issuer
        for a given card number. If the number cannot be matched then the function should return the string Unknown.

        | Card Type  | Begins With          | Number Length |
        |------------|----------------------|---------------|
        | AMEX       | 34 or 37             | 15            |
        | Discover   | 6011                 | 16            |
        | Mastercard | 51, 52, 53, 54 or 55 | 16            |
        | VISA       | 4                    | 13 or 16      |
     */

    public static void main(String[] args) {
        String visa = "4111111111111111";
        String AMEX  = "378282246310005";
        String Unknown = "9111111111111111";
        String Mastercard = "5105105105105100";

        System.out.println(getIssuer(visa));
        System.out.println(getIssuer(AMEX));
        System.out.println(getIssuer(Unknown));
        System.out.println(getIssuer(Mastercard));
    }

    public static String getIssuer(String cardNumber) {
        String result = "Unknown";
        if (cardNumber.length() < 13 || cardNumber.length() > 16 || cardNumber.length() == 14) return result;
        final String amex = "AMEX";
        final String discover = "Discover";
        final String mastercard = "Mastercard";
        final String visa = "VISA";
        if (cardNumber.length() == 15 && (cardNumber.startsWith("34") || cardNumber.startsWith("37"))) result = amex;
        if (cardNumber.length() == 16 && cardNumber.startsWith("6011")) result = discover;
        if (cardNumber.length() == 16 && (cardNumber.startsWith("51") ||
                                            cardNumber.startsWith("52") ||
                                            cardNumber.startsWith("53") ||
                                            cardNumber.startsWith("54") ||
                                            cardNumber.startsWith("55"))) {
            result = mastercard;
        }
        if ((cardNumber.length() == 13 || cardNumber.length() == 16) && cardNumber.startsWith("4")) result = visa;
        return result;
    }

}
