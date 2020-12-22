package javer.codewars.sevenkyu;

public class CreditCardMask {

    public static String maskify(String str) {
        String mask = "";
        String end = "";
        if (str.length() > 4) {
            for (int i = 0; i < str.length() - 4; i++) {
                mask = mask.concat("#");
                end = str.substring(str.length() - 4);
            }
            return mask.concat(end);
        }
        return str;
    }
}
