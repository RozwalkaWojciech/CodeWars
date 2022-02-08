package javer.codewars.sixkyu;

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
}
