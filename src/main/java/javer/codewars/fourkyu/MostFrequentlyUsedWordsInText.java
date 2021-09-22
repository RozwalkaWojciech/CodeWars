package javer.codewars.fourkyu;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.lang.System.out;
import static java.util.stream.Collectors.groupingBy;

/*
Write a function that, given a string of text (possibly with punctuation and line-breaks),
returns an array of the top-3 most occurring words, in descending order of the number of occurrences.

Assumptions:
A word is a string of letters (A to Z) optionally containing one or more apostrophes (') in ASCII. (No need to handle fancy punctuation.)
Matches should be case-insensitive, and the words in the result should be lowercased.
Ties may be broken arbitrarily.
If a text contains fewer than three unique words, then either the top-2 or top-1 words should be returned, or an empty array if a text contains no words.

Examples:
top_3_words("In a village of La Mancha, the name of which I have no desire to call to
mind, there lived not long since one of those gentlemen that keep a lance
in the lance-rack, an old buckler, a lean hack, and a greyhound for
coursing. An olla of rather more beef than mutton, a salad on most
nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra
on Sundays, made away with three-quarters of his income.")
# => ["a", "of", "on"]

top_3_words("e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e")
# => ["e", "ddd", "aa"]

top_3_words("  //wont won't won't")
# => ["won't", "wont"]
For java users, the calls will actually be in the form: TopWords.top3(String s), expecting you to return a List<String>.
 */
public class MostFrequentlyUsedWordsInText {

    public static List<String> top3(String s) {

        Map<String, Integer> map = new TreeMap<>();
        var toLowerCase = s.replaceAll("[^a-zA-Z']", " ").trim().toLowerCase();
        List<String> result = new ArrayList<>();

        for (var str : toLowerCase.split(" ")) {
            if (map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }

        List<Map.Entry<String, Integer>> collect = map.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toList());

        var count = 3;

        for (Map.Entry<String, Integer> entry : collect) {
            if (count == 0) {
                break;
            }
            if (entry.getKey().isEmpty()) {
                continue;
            }
            if (Character.isLetter(entry.getKey().charAt(0))) {
                result.add(entry.getKey());
                count--;
            }
        }
        return result;
    }

    public static List<String> top3bis(String s) {
        return Arrays.stream(s.toLowerCase().split("[^a-z*|']"))
                .filter(o -> !o.isEmpty() && !o.replace("'", "").isEmpty())
                .collect(groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .map(Map.Entry::getKey)
                .limit(3)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        out.println(top3("  '  "));
        out.println(top3("a a a  b  c c  d d d d  e e e e e"));
        out.println(top3("  //wOnt won't won't "));
    }
}

