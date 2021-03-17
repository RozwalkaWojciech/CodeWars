package javer.codewars.sevenkyu;

import java.util.ArrayList;
import java.util.List;

public class AnEnglishTwistOnJapaneseClassic {

    public static List<String> theGame(List<String> words) {

        var result = new ArrayList<String>();

        if (words.isEmpty() || words.get(0).equals("")) {
            return result;
        }
        result.add(words.get(0));
        for (int i = 1; i < words.size(); i++) {
            String current = words.get(i);
            String previous = words.get(i - 1);
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
        String prev = words.isEmpty() || words.get(0).isEmpty() ? "" : "" + words.get(0).charAt(0);
        for (String w : words) if (!w.isEmpty() && prev.endsWith(""+w.charAt(0))) list.add(prev = w); else break;
        return list;
    }
}
