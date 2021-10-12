package javer.codewars.sixkyu;

/*
Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.

Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).

If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.

Examples
"is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
"4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
""  -->  ""
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class YourOrderPlease {

    public static String order(String words) {
        if (words.length() == 0) {
            return "";
        }
        var length = words.split(" ").length;
        var sb = new StringBuilder();
        for (var i = 1; i <= length; i++) {
            for (var str : words.split(" ")) {
                if (str.contains(Integer.toString(i))) {
                    sb.append(str).append(" ");
                }
            }
        }
        return sb.substring(0, sb.length() - 1);
    }

    public static String order2(String words) {
        return Arrays.stream(words.split(" "))
                .sorted((s1, s2) -> {
                    var num1 = Integer.parseInt(s1.replaceAll("\\D+", ""));
                    var num2 = Integer.parseInt(s2.replaceAll("\\D+", ""));
                    return Integer.compare(num1, num2);
                })
                .collect(Collectors.joining(" "));
    }

    public static String order3(String words) {
        return Arrays.stream(words.split(" "))
                .sorted(Comparator.comparing(a -> a.replaceAll("\\D+", "")))
                .collect(Collectors.joining(" "));
    }
}
