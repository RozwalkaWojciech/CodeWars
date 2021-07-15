package javer.codewars.sevenkyu;

public class CreditCardMask {

    public static String maskify(String str) {
        var mask = "";
        var end = "";
        if (str.length() > 4) {
            for (int i = 0; i < str.length() - 4; i++) {
                mask += "#";
                end = str.substring(str.length() - 4);
            }
            return mask + end;
        }
        return str;
    }
}
