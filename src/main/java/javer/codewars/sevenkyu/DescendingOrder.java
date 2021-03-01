package javer.codewars.sevenkyu;

import java.util.Arrays;

public class DescendingOrder {
    public static int sortDesc(final int num) {


        StringBuilder sb = new StringBuilder();
        char[] chars = String.valueOf(num).toCharArray();
        Arrays.sort(chars);
        for (char n : chars) {
            sb.append(n);
        }
        return Integer.parseInt(sb.reverse().toString());
    }
}