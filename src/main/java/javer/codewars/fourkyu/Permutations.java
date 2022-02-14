package javer.codewars.fourkyu;

import java.util.HashSet;
import java.util.List;

/*
In this kata you have to create all permutations of an input string and remove duplicates, if present.
This means, you have to shuffle all letters from the input in all possible orders.

Examples:
Permutations.singlePermutations("a") `shouldBe` ["a"]
Permutations.singlePermutations("ab") `shouldBe` ["ab", "ba"]
Permutations.singlePermutations("aabb") `shouldBe` ["aabb","abab","abba","baab","baba","bbaa"]
The order of the permutations doesn't matter.
*/
public class Permutations {

    public static List<String> singlePermutations(String s) {
        var set = new HashSet<String>();
        if (s.length() == 0) {
            set.add(s);
            return List.copyOf(set);
        }
        for (var i = 0; i < s.length(); i++) {
            List<String> temp = singlePermutations(s.substring(0, i) + s.substring(i + 1));
            for (String str : temp) {
                set.add(s.charAt(i) + str);
            }
        }
        return List.copyOf(set);
    }
}
