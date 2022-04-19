package javer.codewars.sevenkyu;

import java.util.Arrays;
import java.util.Comparator;

import static java.lang.Integer.parseInt;
import static java.util.stream.Collectors.joining;

public class DescendingOrder {

    public static int sortDesc(final int num) {
        var sb = new StringBuilder();
        char[] chars = String.valueOf(num).toCharArray();
        Arrays.sort(chars);
        for (var ch : chars) {
            sb.append(ch);
        }
        return parseInt(sb.reverse().toString());
    }

    public static int sortDecsFunctional(final int num) {
        return parseInt(String.valueOf(num)
                .chars()
                .mapToObj(value -> String.valueOf(Character.getNumericValue(value)))
                .sorted(Comparator.reverseOrder())
                .collect(joining())
        );
    }
}
