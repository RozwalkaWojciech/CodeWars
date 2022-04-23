package javer.codewars.sevenkyu;

import java.util.Arrays;
import java.util.Comparator;

import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;
import static java.util.stream.Collectors.joining;

public class DescendingOrder {

    public static int sortDesc(final int num) {
        var sb = new StringBuilder();
        char[] chars = valueOf(num).toCharArray();
        Arrays.sort(chars);
        for (var ch : chars) {
            sb.append(ch);
        }
        return parseInt(sb.reverse().toString());
    }

    public static int sortDecsFunctional(final int num) {
        return parseInt(valueOf(num)
                .chars()
                .mapToObj(value -> valueOf(Character.getNumericValue(value)))
                .sorted(Comparator.reverseOrder())
                .collect(joining())
        );
    }
}
