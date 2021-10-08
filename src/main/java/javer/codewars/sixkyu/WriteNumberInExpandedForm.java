package javer.codewars.sixkyu;

import static java.lang.System.out;

public class WriteNumberInExpandedForm {

    public static String expandedForm(int num) {
        var result = "";

        for (var i = 10; i < num; i *= 10) {
            var remain = num % i;
            result = (remain > 0) ? " + " + remain + result : result;
            num -= remain;
        }
        return num + result;
    }

    public static void main(String[] args) {
        out.println(expandedForm(8003));
        out.println(expandedForm(845620));
    }
}
