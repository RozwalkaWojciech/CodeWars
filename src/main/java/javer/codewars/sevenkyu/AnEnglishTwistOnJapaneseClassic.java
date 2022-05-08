package javer.codewars.sevenkyu;

/*
In Japan, a game called Shiritori is played.
The rules are simple, a group of people take turns calling out a word whose beginning syllable is the same as the previous player's ending syllable.
For example, the first person would say the word ねこ, and the second player must make a word that starts with こ, like　こむぎ.
This repeats until a player can not think of a word fast enough or makes a word that ends in ん, because there are no words that begin with ん　in the Japanese language.

English Shiritori has the same principle, with the first and last letters of words.
That being said the lose condition is saying a word that doesn't start with the previous word's last letter or not saying a word quick enough.

For example: apple -> eggs -> salmon -> nut -> turkey ...

Your Task:
You will be given a list of strings, a transcript of an English Shiritori match.
Your task is to find out if the game ended early, and return a list that contains every valid string until the mistake. \
If a list is empty return an empty list. If one of the elements is an empty string, that is invalid and should be handled.
 */

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static java.util.stream.IntStream.range;

public class AnEnglishTwistOnJapaneseClassic {

    public static List<String> theGame(List<String> words) {
        var result = new ArrayList<String>();
        if (words.isEmpty() || words.get(0).equals("")) {
            return result;
        }
        result.add(words.get(0));
        for (var i = 1; i < words.size(); i++) {
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
        var list = new ArrayList<String>();
        var prevWord = words.isEmpty() || words.get(0).isEmpty() ? "" : "" + words.get(0).charAt(0);
        for (var word : words)
            if (!word.isEmpty() && prevWord.endsWith("" + word.charAt(0))) list.add(prevWord = word);
            else break;
        return list;
    }

    public static List<String> theGame3(List<String> words) {
        if (words.isEmpty() || words.get(0).isEmpty()) {
            return new ArrayList<>();
        }
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
                .collect(toList());
    }
}
