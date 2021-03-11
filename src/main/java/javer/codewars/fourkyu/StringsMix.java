package javer.codewars.fourkyu;

import java.util.*;
import java.util.stream.Collectors;

/*
Given two strings s1 and s2, we want to visualize how different the two strings are.
We will only take into account the lowercase letters (a to z).
First let us count the frequency of each lowercase letters in s1 and s2.

s1 = "A aaaa bb c"
s2 = "& aaa bbb c d"
s1 has 4 'a', 2 'b', 1 'c'
s2 has 3 'a', 3 'b', 1 'c', 1 'd'

So the maximum for 'a' in s1 and s2 is 4 from s1; the maximum for 'b' is 3 from s2.
In the following we will not consider letters when the maximum of their occurrences is less than or equal to 1.
We can resume the differences between s1 and s2 in the following string: "1:aaaa/2:bbb" where 1 in 1:aaaa stands for string s1 and aaaa because the maximum for a is 4.
In the same manner 2:bbb stands for string s2 and bbb because the maximum for b is 3.
The task is to produce a string in which each lowercase letters of s1 or s2 appears as many times as its maximum if this maximum is strictly greater than 1; these letters will be prefixed by the number of the string where they appear with their maximum value and :. If the maximum is in s1 as well as in s2 the prefix is =:.
In the result, substrings (a substring is for example 2:nnnnn or 1:hhh; it contains the prefix) will be in decreasing order of their length and when they have the same length sorted in ascending lexicographic order (letters and digits - more precisely sorted by codepoint); the different groups will be separated by '/'. See examples and "Example Tests".
Hopefully other examples can make this clearer.

s1 = "my&friend&Paul has heavy hats! &"
s2 = "my friend John has many many friends &"
mix(s1, s2) --> "2:nnnnn/1:aaaa/1:hhh/2:mmm/2:yyy/2:dd/2:ff/2:ii/2:rr/=:ee/=:ss"

s1 = "mmmmm m nnnnn y&friend&Paul has heavy hats! &"
s2 = "my frie n d Joh n has ma n y ma n y frie n ds n&"
mix(s1, s2) --> "1:mmmmmm/=:nnnnnn/1:aaaa/1:hhh/2:yyy/2:dd/2:ff/2:ii/2:rr/=:ee/=:ss"

s1="Are the kids at home? aaaaa fffff"
s2="Yes they are here! aaaaa fffff"
mix(s1, s2) --> "=:aaaaaa/2:eeeee/=:fffff/1:tt/2:rr/=:hh"
 */
public class StringsMix {

    public static String mix(String s1, String s2) {

        var sb = new StringBuilder();

        char[] arr1 = s1.replaceAll("[^a-z]", "").toCharArray();
        char[] arr2 = s2.replaceAll("[^a-z]", "").toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        s1 = new String(arr1);
        s2 = new String(arr2);

        Map<Character, Integer> map1 = setMap(s1);
        Map<Character, Integer> map2 = setMap(s2);

        //test ok
        System.out.println(map1);
        System.out.println(map2);

        //do method to concatenation maps!!!!!!
        Map<Character, Integer> fusionMap = concatenateMaps(map1, map2);

        //before sort
        System.out.println("Fusion " + fusionMap);

        List<Map.Entry<Character, Integer>> sortedListByValue = fusionMap.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toList());

        //after sort
        System.out.println("Sort fusion " + sortedListByValue);

        for (Map.Entry<Character, Integer> entry : sortedListByValue) {
            if (map1.containsKey(entry.getKey()) && map2.containsKey(entry.getKey())) {
                if (map1.get(entry.getKey()) > map2.get(entry.getKey())) {
                    sb.append("1:").append(charsToString(entry.getKey(), entry.getValue()));
                } else if (map1.get(entry.getKey()) < map2.get(entry.getKey())) {
                    sb.append("2:").append(charsToString(entry.getKey(), entry.getValue()));
                } else {
                    sb.append("=:").append(charsToString(entry.getKey(), entry.getValue()));
                }
            } else if (map1.containsKey(entry.getKey())) {
                sb.append("1:").append(charsToString(entry.getKey(), entry.getValue()));
            } else {
                sb.append("2:").append(charsToString(entry.getKey(), entry.getValue()));
            }
            sb.append('/');
        }
        return sb.toString();
    }

    private static Map<Character, Integer> setMap(String str) {

        Map<Character, Integer> map = new TreeMap<>();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i - 1)) {
                map.put(str.charAt(i - 1), count);
                count = 1;
            } else {
                count++;
            }
        }
        if (!map.containsKey(str.charAt(str.length() - 1))) {
            map.put(str.charAt(str.length() - 1), count);
        }
        return map;
    }

    private static Map<Character, Integer> concatenateMaps(Map<Character, Integer> map1, Map<Character, Integer> map2) {

        Map<Character, Integer> concatMap = new HashMap<>();
        Map<Character, Integer> smallerMap;

        if (map1.size() > map2.size()) {
            smallerMap = map2;
            concatMap.putAll(map1);
        } else {
            smallerMap = map1;
            concatMap.putAll(map2);
        }
        for (Map.Entry<Character, Integer> entry : smallerMap.entrySet()) {
            if (!concatMap.containsKey(entry.getKey())) {
                concatMap.put(entry.getKey(), entry.getValue());
            } else {
                for (Map.Entry<Character, Integer> entry2 : concatMap.entrySet()) {
                    if (entry.getValue() > entry2.getValue()) {
                        concatMap.put(entry.getKey(), entry.getValue());
                    }
                }
            }
        }
        return concatMap;
    }

    private static String charsToString(char c, int num) {
        return String.valueOf(c).repeat(num);
    }

    public static void main(String[] args) {
        System.out.println(mix("aaaabbbcccccc", "aacccffggggg"));
        System.out.println(mix("aabbcc", "aabbcc"));
    }
}
