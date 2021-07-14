package javer.codewars.sevenkyu;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.IntStream.range;

public class AnEnglishTwistOnJapaneseClassic {

    public static List<String> theGame(List<String> words) {

        var result = new ArrayList<String>();

        if (words.isEmpty() || words.get(0).equals("")) {
            return result;
        }
        result.add(words.get(0));
        for (int i = 1; i < words.size(); i++) {
            var current = words.get(i);
            var previous = words.get(i - 1);
            if (current.equals("")) {
                break;
            }
            if (current.charAt(0) == previous.charAt(previous.length() - 1)) {
                result.add(current);
            } else {
                return result;
            }
        }
        return result;
    }

    public static List<String> theGame2(List<String> words) {
        final List<String> list = new ArrayList<>();
        var prev = words.isEmpty() || words.get(0).isEmpty() ? "" : "" + words.get(0).charAt(0);
        for (String w : words)
            if (!w.isEmpty() && prev.endsWith("" + w.charAt(0))) list.add(prev = w);
            else break;
        return list;
    }

    public static List<String> theGame3(List<String> words) {

        if (words.isEmpty() || words.get(0).isEmpty())
            return new ArrayList<>();

        int x = range(1, words.size())
                .filter(i -> words.get(i).isEmpty()
                        || words.get(i - 1).charAt(words.get(i - 1).length() - 1) != words.get(i).charAt(0))
                .findFirst()
                .orElse(words.size());
        return words.subList(0, x);
    }

    public static List<String> theGame4(List<String> words) {
        return range(0, words.size())
                .takeWhile(i -> !words.get(i).isEmpty() &&
                        (i == 0 || words.get(i).charAt(0) == words.get(i - 1).charAt(words.get(i - 1).length() - 1)))
                .mapToObj(words::get)
                .collect(Collectors.toList());
    }
}
