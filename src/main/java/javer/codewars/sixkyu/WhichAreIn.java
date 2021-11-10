package javer.codewars.sixkyu;

/*
Given two arrays of strings a1 and a2 return a sorted array r in lexicographical order of the strings of a1 which are substrings of strings of a2.
Example 1:
a1 = ["arp", "live", "strong"]
a2 = ["lively", "alive", "harp", "sharp", "armstrong"
returns ["arp", "live", "strong"]
Example 2:
a1 = ["tarp", "mice", "bull"]
a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
returns []
Notes:
Arrays are written in "general" notation. See "Your Test Cases" for examples in your language.
In Shell bash a1 and a2 are strings. The return is a string where words are separated by commas.
Beware: r must be without duplicates.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class WhichAreIn {

    public static String[] inArray(String[] array1, String[] array2) {
        List<String> result = new ArrayList<>();
        for (var strArr1 : array1) {
            for (var strArr2 : array2) {
                if (strArr2.contains(strArr1)) {
                    result.add(strArr1);
                    break;
                }
            }
        }
        return result.toArray(new String[0]);
    }

    public static String[] inArray2(String[] array1, String[] array2) {
        return Stream.of(array1)
                .filter(s1 -> (Arrays.stream(array2))
                        .anyMatch(s2 -> s2.contains(s1)))
                .sorted()
                .toArray(String[]::new);
    }
}

