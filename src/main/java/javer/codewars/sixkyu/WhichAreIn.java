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
import java.util.List;

public class WhichAreIn {

    public static String[] inArray(String[] array1, String[] array2) {

        List<String> result = new ArrayList<>();

        for (String value : array1) {
            for (String s : array2) {
                if (s.contains(value)) {
                    result.add(value);
                    break;
                }
            }
        }
        return result.toArray(new String[0]);
    }
}
