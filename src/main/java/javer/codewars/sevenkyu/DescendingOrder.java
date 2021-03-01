package javer.codewars.sevenkyu;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

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

    public static int sortDecsFunctional(final int num) {
        return Integer.parseInt(String.valueOf(num)
                .chars()
                .mapToObj(value -> String.valueOf(Character.getNumericValue(value)))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining())
        );
    }
}