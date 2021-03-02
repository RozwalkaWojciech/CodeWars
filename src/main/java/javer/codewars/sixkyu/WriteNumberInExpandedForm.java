package javer.codewars.sixkyu;

public class WriteNumberInExpandedForm {

    public static String expandedForm(int num) {

        String result = "";

        for (int i = 10; i < num; i *= 10) {
            int remain = num % i;
            result = (remain > 0) ? " + " + remain + result : result;
            num -= remain;
        }
        result = num + result;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(expandedForm(8003));
        System.out.println(expandedForm(845620));
    }
}
